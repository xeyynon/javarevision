import java.util.*;;

public class incrementalSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the maximun value up to which you want prime numbers: ");
        int max = sc.nextInt();

        PrimeGenerator generator = new PrimeGenerator();

        System.out.println("Prime numbers up to" + max + "Using Incremental Sieve");

        while (true) {
            int prime = generator.nextPrime();
            if (prime > max)
                break;
            System.out.println(prime + " ");
        }
    }
}

class PrimeGenerator {
    private int current = 2;
    private Map<Integer, List<Integer>> compositeMap = new HashMap<>();

    public int nextPrime() {
        while (true) {
            if (!compositeMap.containsKey(current)) {
                // Found a new prime
                compositeMap.put(current * current, new ArrayList<>(List.of(current)));
                return current++;
            } else {
                // It's a composite numbmer
                for (int prime : compositeMap.get(current)) {
                    int nextMultiple = current + prime;
                    compositeMap.computeIfAbsent(nextMultiple, k -> new ArrayList<>()).add(prime);
                }
                compositeMap.remove(current);
                current++;
            }
        }
    }
}