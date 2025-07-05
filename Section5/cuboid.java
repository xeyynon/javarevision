import java.util.Scanner;

public class cuboid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float length, breadth, height;
        float totalArea, volume;

        System.out.println("Enter the value of Length,Breadth,Height");
        length = sc.nextFloat();
        breadth = sc.nextFloat();
        height = sc.nextFloat();

        totalArea = 2 * (length * breadth + length * height + breadth * height);
        volume = length * breadth * height;

        System.out.println("Total area of cuboid = " + totalArea);
        System.out.println("Volume of Cuboid is = " + volume);
    }
}
