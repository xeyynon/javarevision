package Section7;

import java.util.Scanner;

public class whichDay {

    void WhichDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("invalid input,please try again...");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        whichDay wd = new whichDay();
        System.out.println("Enter Your Day(1-7)");
        int dayno = sc.nextInt();

        wd.WhichDay(dayno);

    }
}
