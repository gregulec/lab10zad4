package lab10zad4;

public class Elipse extends Shape {
    protected double major, minor;

    public Elipse(String name,double major, double minor) {
        super(name);
        this.major = major;
        this.minor = minor;
        System.out.println(name+" construed");
    }

    @Override
    public double area() {
        return Math.PI*major*minor;
    }

    @Override
    public double perimeter() {
        return Math.PI*(3/2*(major+minor)-Math.sqrt(major*minor));
    }
    
    
}
