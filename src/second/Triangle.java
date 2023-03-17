package second;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double a, double b, double c) {
        if(a + b> c && a + c> b && b + c> a && a> 0 && b> 0 && c> 0){
        sideA = a;
        sideB = b;
        sideC = c;
        }
        else{System.out.println("Bad value: a + b > c");}
    }
    public Triangle() {
        sideA = 6;
        sideB = 6;
        sideC = 6;
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
    //Порівняння
    @Override
    public boolean equals(Object obj) {
         boolean r = false;
         if(obj == null){
            return r;  
         }
         if ( obj instanceof Triangle ){
             Triangle obj1 = (Triangle) obj;
             if ( getArea()==obj1.getArea()) r = true;
         }
        return r;
    }
}
