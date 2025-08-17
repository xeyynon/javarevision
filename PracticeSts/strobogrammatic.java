import java.util.*;

public class strobogrammatic {
    public static ArrayList<String> Strobo(int n) {
        ArrayList<String> result = numDef(n, n);
        return result;
    }

    public static ArrayList<String> numDef(int n, int length) {
        if (n == 0)
            return new ArrayList<String>(Arrays.asList(new String[] { "" }));
        if (n == 1)
            return new ArrayList<String>(Arrays.asList(new String[] { "1", "0", "8" }));
        ArrayList<String> middles = numDef(n - 2, length);
        ArrayList<String> result = new ArrayList<String>();

        for (String middle : middles) {
            if (n != length)
                result.add("0" + middle + "0");
            result.add("8" + middle + "8");
            result.add("1" + middle + "1");
            result.add("9" + middle + "6");
            result.add("6" + middle + "9");

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(Strobo(3));
    }
}
