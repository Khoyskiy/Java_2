import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Lab 2 ");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the sides of the triangle A, B, C: ");    // 6 6 6;  3 4 5; 4 5,657 4
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        System.out.print("Enter the angles of the triangle A, B, C: ");   // 60 60 60;  36,87 53,13 90; 45 90 45
        double angA = in.nextDouble();
        double angB = in.nextDouble();
        double angC = in.nextDouble();
        Triangle obj = new Triangle(A, B, C, angA, angB, angC);
        if(obj.check()){
            System.out.println("Трикутник сторони: sideA = " + obj.getSideA() + " sideB = " + obj.getSideB() + " sideC = " + obj.getSideC());
            System.out.println("Трикутник кути: angleA = " + obj.getAngleA() + " angleB = " + obj.getAngleB() + " angleC = " + obj.getAngleC());
            System.out.println("Площа трикутника: " + obj.getArea() + " Периметр: " + obj.getPerimeter());
            System.out.println("Висота до sideA: " + obj.getHeightA()+ " Висота до sideB: " + obj.getHeightB() + " Висота до sideC: " + obj.getHeightC());
            System.out.println("Тип трикутника: ");
            obj.getType();
        }
        else System.out.println("The triangle does not exist");
        System.out.println("\n\n");
        Triangle obj1 = new Triangle();
        obj1.setSideA(10.39);
        obj1.setAngleA(120);
        obj1.setAngleB(30);
        obj1.setAngleC(30);
            System.out.println("Трикутник сторони: sideA = " + obj1.getSideA() + " sideB = " + obj1.getSideB() + " sideC = " + obj1.getSideC());
            System.out.println("Трикутник кути: angleA = " + obj1.getAngleA() + " angleB = " + obj1.getAngleB() + " angleC = " + obj1.getAngleC());
            System.out.println("Площа трикутника: " + obj1.getArea() + " Периметр: " + obj1.getPerimeter());
            System.out.println("Висота до sideA: " + obj1.getHeightA()+ " Висота до sideB: " + obj1.getHeightB() + " Висота до sideC: " + obj1.getHeightC());
            System.out.println("Тип трикутника: ");
            obj1.getType();
            in.close();
    }
   
}
