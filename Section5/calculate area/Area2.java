import java.util.Scanner;

public class Area2 {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int a,b,c;
    float s;
    double Area;

    System.out.println("Enter the values of Side A,B,C ");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();

    s=(a+b+c)/2f;
    //s=(float)(a+b+c)/2f;
    Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

    System.out.println("The area of the triangle is " + Area );
    }

    

}
