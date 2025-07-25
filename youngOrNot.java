import java.util.Scanner;

public class youngOrNot {

    void YoungOrNot(int age) {
        if (age > 35) {
            System.out.println("Not Young");
        } else if (age > 60) {
            System.out.println("Old");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 21 && age > 40) {
            System.out.println("Young");
        } else
            System.out.println("INVALID INPUT");
    }

    public static void main(String[] args) {
        youngOrNot yon = new youngOrNot();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = sc.nextInt();

        yon.YoungOrNot(age);

    }

}
