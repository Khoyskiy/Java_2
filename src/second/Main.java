package second;
import java.util.Scanner;
public class Main {
    static Scanner in;
    public static Triangle Input(){
        System.out.print("Enter the sides of the triangle A, B, C: ");    // 6 6 6;  3 4 5; 4 5,657 4
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        Triangle a = new Triangle(A, B, C);
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
        in = new Scanner(System.in);
        Triangle obj = Input();
        System.out.println("Площа трикутника: " + obj.getArea() + " Периметр: " + obj.getPerimeter());
        Triangle obj1 = Input();
        System.out.println("Площа трикутника: " + obj1.getArea() + " Периметр: " + obj1.getPerimeter());
        Triangle objn = new Triangle();
        System.out.println("Площа трикутника: " + objn.getArea() + " Периметр: " + objn.getPerimeter());
        System.out.println(obj1.equals(obj));
    }
}