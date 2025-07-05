import java.util.Scanner;

public class quadEq {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        double r1,r2;

        System.out.println("Enter the cofficient values of A,B,C ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        double d = Math.sqrt(((b*b)-4*a*c));

        r1=(-b+d)/2*a;
        r2=(-b-d)/2*a;
        System.out.println(d);
        System.out.println("First Root = "+r1);
        System.out.println("Second Root = "+r2);
    }
}
