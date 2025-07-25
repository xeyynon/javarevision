package Section7;

import java.util.Scanner;

public class oddEven {

    int checkOddEven(int testNumber) {
        if (testNumber % 2 == 0) {
            return 0;
        } else
            return -1;
    }

    public static void main(String[] args) {
        oddEven oo = new oddEven();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check either odd or even");
        int testNumber = sc.nextInt();
        int result = oo.checkOddEven(testNumber);
        if (result == -0) {
            System.out.println("Given Number is Even");
        } else
            System.out.println("Given Number is Odd");

    }
}
