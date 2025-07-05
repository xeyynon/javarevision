import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 12;
        int b = 9;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);


    }
}
