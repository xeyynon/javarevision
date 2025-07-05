import java.util.Scanner;

public class Area1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);


    float base,height,area;
    System.out.println("Enter the value of Base ");
    base=sc.nextFloat();
    System.out.println("Enter the value of Height ");
    height=sc.nextFloat();
    area = (base*height)*(1f/2f);  //base*height/2;
    System.out.println("The Value of Area is "+base);
    System.out.println("The Value of Area is "+height);
    System.out.println("The Value of Area is "+area);
     
    }

}   