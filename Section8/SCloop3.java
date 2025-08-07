package Section8;

import java.util.Scanner;

public class SCloop3 {

    static void Switch1(char str) {
        switch (str) {
            case '0':
                System.out.print("zero ");
                break;
            case '1':
                System.out.print("One ");
                break;
            case '2':
                System.out.print("Two ");
                break;
            case '3':
                System.out.print("Three ");
                break;
            case '4':
                System.out.print("Four ");
                break;
            case '5':
                System.out.print("Five ");
                break;
            case '6':
                System.out.print("Six ");
                break;
            case '7':
                System.out.print("Seven ");
                break;
            case '8':
                System.out.print("Eight ");
                break;
            case '9':
                System.out.print("Nine ");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        String str = "";
        // int n = reverse(number);
        int n = number;
        while (n > 0) {
            int digit = n % 10;
            str = str + digit;

            // Switch1(str);
            n = n / 10;
        }
        System.out.println(str);

        char c;
        for (int i = str.length() - 1; i >= 0; i--) {
            c = str.charAt(i);
            Switch1(c);
        }

    }
}
