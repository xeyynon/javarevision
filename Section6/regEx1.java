package Section6;

public class regEx1 {
    public static void main(String[] args) {
        String str = "a#B@c#1!#2%3";
        String new_str = str.replaceAll("\\W", "");
        // String new_str = str.replaceAll("[^a-zA-Z0-9]", "");
        // System.out.println(new_str);

        String str2 = "abc    de     fgh    ijk";
        String new_Str2 = str2.replaceAll("\\s", "");

        System.out.println(new_Str2);

    }
}
