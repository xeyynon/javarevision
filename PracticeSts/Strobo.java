import java.util.HashSet;

public class Strobo {
    public boolean isStrobo(String num) {
        HashSet<String> set = new HashSet();

        set.add("0");
        set.add("1");
        set.add("8");
        set.add("00");
        set.add("11");
        set.add("88");
        set.add("69");
        set.add("96");

        for (int left = 0, right = num.length() - 1; left <= right; left++, right--) {
            if (set.contains(num.charAt(left) + " " + num.charAt(right)))
                return false;
        }
        return true;
    }

}
