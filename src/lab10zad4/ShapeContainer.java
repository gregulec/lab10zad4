package lab10zad4;
import java.util.ArrayList;
import java.util.List;

public class ShapeContainer {
    List<Shape> shapes=new ArrayList<>();
    
    public void add(Shape shape){
        shapes.add(shape);
    }
    public void print(){
        for(Shape shape:shapes){
            System.out.println("Figura "+shape.name);
            System.out.println("Pole "+shape.area());
            System.out.println("Obwod "+shape.perimeter());
        }
    }
}
