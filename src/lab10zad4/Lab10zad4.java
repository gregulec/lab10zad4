package lab10zad4;

public class Lab10zad4 {

    public static void main(String[] args) {
      ShapeContainer shapes=new ShapeContainer();
      Rectangle rectangle=new Rectangle("prostokat",2.0,3.0);
      Square square=new Square("square",2.0);
      Circle circle=new Circle("kolo",2.0);
      Elipse elipse=new Elipse("elipsa",2.0,3.0);
      shapes.add(rectangle);
      shapes.add(square);
      shapes.add(circle);
      shapes.add(elipse);
      shapes.print();
    }
}
