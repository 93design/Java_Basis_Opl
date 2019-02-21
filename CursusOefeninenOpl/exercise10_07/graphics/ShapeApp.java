package be.intecbrussel.basis.exercise10_07.graphics;

public class ShapeApp {
   public static void main(String[] args) {

      Circle circle = new Circle(5);
      Square square = new Square(8);
      Rectangle rectangle = new Rectangle(5,9);
  
      System.out.println(circle.getRadius());
      System.out.println(rectangle.getWidth() + " " + rectangle.getHeight());
      System.out.println(square.getSide());
      
      System.out.println(Shape.getCount());
      System.out.println(Rectangle.getCount());
      System.out.println(Square.getCount());
      System.out.println(Circle.getCount());
      
      
   }   
  
}
