package Section7;

import java.util.Scanner;

public class radix {

    void radixChecker(String inp) {
        if (inp.matches("[01]+")) {
            System.out.println("Binary Number");
        } else if (inp.matches("[0-7]+")) {
            System.out.println("Octal Number");
        } else if (inp.matches("[0-9]+")) {
            System.out.println("Decimal Number");
        } else if (inp.matches("[0-9A-Fa-f]+")) {
            System.out.println("Hexadecimal Number");
        } else {
            System.out.println("Not a valid number in known radices.");
        }
    }

    public static void main(String[] args) {
        radix rr = new radix();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String in = sc.nextLine();
        rr.radixChecker(in);

    }
}
