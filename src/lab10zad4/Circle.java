package lab10zad4;

public class Circle extends Shape{
    private double radius;

    public Circle( String name,double radius) {
        super(name);
        this.radius = radius;
        System.out.println(name+" construed");
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    
    
}
