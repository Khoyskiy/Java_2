package third;

public class Complex {
    private double a;
    private double b;

    public Complex(double a1,double b1){
        a = a1;
        b = b1;
    }
    public Complex(){
        a = 2;
        b = 3;
    }

    public void print()
    {
        if(b == 0){
            System.out.println("Diusna: " + a);
        }
        else {
            if(b<0){
                System.out.println( a + " " + b +"i");
            }
            else System.out.println(toString(a,b));
        }
    }
    public Complex dod(Complex x){  
        double A;
        double B;
        A = a + x.a;
        B = b + x.b;
        if(B == 0){
            System.out.println("Sum: " + A);
        }
        else {
            if(B<0){
                System.out.println("Sum: "+ A + " " + B +"i");
            }
            else System.out.println("Sum: "+ toString(A,B));
        }
        return new Complex(A,B);
    }

    public Complex vidnim(Complex x){
        double A;
        double B;       ///Subtraction
        A = a - x.a;
        B = b - x.b;
        if(B == 0){
            System.out.println("Subtraction: " + A);
        }
        else {
            if(B<0){
                System.out.println("Subtraction: " + A + " " + B +"i");
            }
            else System.out.println("Subtraction: " + toString(A,B));
        }
        return new Complex(A,B);
    }

    public Complex mnog(Complex x){
        double A;
        double B;
        A = a * x.a - b * x.b;
        B = a * x.b + b * x.a;
        if(B == 0){
            System.out.println("Mnog: " + A);
        }
        else {
            if(B<0){
                System.out.println("Mnog: " + A + " " + B +"i");
            }
            else System.out.println("Mnog: " + toString(A,B));
        }
        return new Complex(A,B);
    }

    public Complex dil(Complex x){
        double A;
        double B;
        A = (a * x.a + b * x.b)/(x.a * x.a + x.b * x.b);
        B = (a * x.b - b * x.a)/(x.a * x.a + x.b * x.b);
        if(B == 0){
            System.out.println("Division: " + A);
        }
        else {
            if(B>0){
                System.out.println("Division: " + A + " -" + B + "i");
            }
            else System.out.println("Division: " + A + " +" + Math.abs(B) + "i");
        }
        return new Complex(A,B);
    }
    public double modyl(){
        return Math.sqrt(a*a+b*b);
    }
    public double argyment(){
        return Math.tan(b/a);
    }
     public String toString(double A, double B) {
     return String.format("%.2f + %.2fi",A,B);
    }
}
