package third;
import java.util.Scanner;
public class Main {
    static Scanner in;
    public static Complex Input(){
        System.out.print("Enter the complex number a, b: "); 
        double A = in.nextDouble();
        double B = in.nextDouble();
        Complex a = new Complex(A, B);
        return a;
    }
    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
        in = new Scanner(System.in);
        Complex obj = Input();
        Complex obj1 = new Complex();
        Complex obj2 = new Complex();
        System.out.println("All function: ");
        obj2 = obj.dod(obj1);
        obj2.print();
        obj2.vidnim(obj1);
        obj.mnog(obj1);
        obj.dil(obj1);
        System.out.println("Modyl: " + obj.modyl());
        System.out.println("Argyment: " + obj.argyment());
    }
}
