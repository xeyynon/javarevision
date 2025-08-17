import java.util.*;


public class segmentedSieve {
    static int N = 100000;
    static boolean arr[] = new boolean[N+1];
    static void simpleSieve(){
        for(int i=2;i<=N;i++){
            arr[i]=true;
        }

        for(int i=2;i<Math.sqrt(N);i++){
            if(arr[i]==true){
                for(int j=i*i;j<=N;j=j+i){
                    arr[j]=false;
                }
            }
        }
    }
    static ArrayList<Integer> generatPrimes(int n){
        ArrayList<Integer> al = new ArrayList();
        for(int i=2;i<Math.sqrt(n);i++){
            if(arr[i]){
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        simpleSieve();
        ArrayList<Integer> al = generatPrimes(high);

        boolean dummy[]= new boolean[high-low+1];
        for(int i=0;i<high-low+1;i++){
            dummy[i]=true;
        }

        for(int prime:al){
            int firstMultiple = (low/prime)*prime;
            if(firstMultiple<low){
                firstMultiple=firstMultiple+prime;
            }
            int start = Math.max(firstMultiple,prime*prime);
            for(int j = start;j<=high;j+=prime){
                dummy[j-low]=false;
            }
        }
        for(int i=low;i<=high;i++){
            if(dummy[i-low]==true){
                System.out.println(i+" ");
            }
        }
    }
}
