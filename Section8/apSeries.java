package Section8;

import java.util.Scanner;

public class apSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Ath term");
        int a = sc.nextInt();
        System.out.println("Enter the difference");
        int d = sc.nextInt();
        System.out.println("Enter till where the progression is needed ");
        int n = sc.nextInt();
        int aa = a;
        for (int i = 0; i <= n; i++) {
            System.out.println(aa);
            aa = aa + d;

        }

    }
}
