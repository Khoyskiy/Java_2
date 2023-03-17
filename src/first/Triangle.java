public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double angleA;
    private double angleB;
    private double angleC;

    // Конструктор, який ініціалізує поля даних класу
    public Triangle(double a, double b, double c, double A, double B, double C) {
        sideA = a;
        sideB = b;
        sideC = c;
        angleA = A;
        angleB = B;
        angleC = C;
    }
    public Triangle() {
        sideA = 6;
        sideB = 6;
        sideC = 6;
        angleA = 60;
        angleB = 60;
        angleC = 60;
    }
    public boolean check(){
        double xa = sideA/Math.sin(Math.toRadians(angleA));
        double xb = sideB/Math.sin(Math.toRadians(angleB));
        double xc = sideC/Math.sin(Math.toRadians(angleC));
        String xA = String.format("%.2f", xa);
        String xB = String.format("%.2f", xb);
        String xC = String.format("%.2f", xc);
        if(sideA + sideB> sideC && sideA + sideC> sideB && sideB + sideC> sideA && sideA> 0 && sideB> 0 && sideC> 0){
                if(xA.equals(xB) && xB.equals(xC) && angleA + angleB + angleC == 180){
                    return true;
                }
                else {
                   // System.out.println("The triangle does not exist (the angles are incorrect)");
                    return false;
                }
        }
        else {
            //System.out.println("The triangle does not exist (The sides are not correct)");
            return false;
        }
    }
    // Методи, що повертають значення полів даних класу
    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getAngleA() {
        return angleA;
    }

    public double getAngleB() {
        return angleB;
    }

    public double getAngleC() {
        return angleC;
    }

    // Методи, що змінюють значення полів даних класу
    public void setSideA(double a) {
        sideA = a;
    }

    public void setSideB(double b) {
        sideB = b;
    }

    public void setSideC(double c) {
        sideC = c;
    }

    public void setAngleA(double A) {
        angleA = A;
    }

    public void setAngleB(double B) {
        angleB = B;
    }

    public void setAngleC(double C) {
        angleC = C;
    }

    // формул Герона
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    //периметр трикутника
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    //висоту трикутника
    public double getHeightA() {
        return 2 * getArea() / sideA;
    }

   
    public double getHeightB() {
        return 2 * getArea() / sideB;
    }

   
    public double getHeightC() {
        return 2 * getArea() / sideC;
    }

    //вигляд трикутника
    public void getType() {
        if (sideA == sideB && sideB == sideC) {
            System.out.print("Рiвностороннiй ");
        }
        else if(sideA == sideB || sideA == sideC || sideB ==sideC){

            System.out.print("рiвнобедрений ");
        }
        if(angleA == 90 || angleB == 90 || angleC == 90){
            System.out.println("прямокутний трикутник");
        }
        else System.out.println("трикутник");
    }
}



