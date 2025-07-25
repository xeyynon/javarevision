package Section7;

import java.util.Scanner;

public class leapYear {

    void LeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Yes,It is a leap year");
                } else
                    System.out.println("No,it is not a leap year");
            } else
                System.out.println("Yes,It is a leap year");
        } else
            System.out.println("It is not a leap year");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the Year to check Whether it is a leap year or not..");
        int inputYear = sc.nextInt();

        leapYear ly = new leapYear();

        ly.LeapYear(inputYear);

    }

}
