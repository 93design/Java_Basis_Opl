package be.intecbrussel.basis.exercise10_08.graphics;

public class ShapeApp {
   public static void main(String[] args) {
      Rectangle rect = new Rectangle(3,4,2,8);      
      Square square = new Square(7,8,5);
      Circle circle = new Circle(5,9,3);
      Triangle triangle = new Triangle(4,6,4,8,3);
      IsoScelesTriangle ist = new IsoScelesTriangle(2,3,8,9);
      
      System.out.println(rect);
      System.out.println(square);
      System.out.println(circle);   
      System.out.println(triangle);
      System.out.println(ist);
   
      Rectangle rect1 = new Rectangle(4,7,8,2);
      Rectangle rect2 = new Rectangle(4,7,8,2);
      Rectangle rect3 = new Rectangle(3,7,8,2);
      System.out.println(rect1 == rect2);
      System.out.println(rect1.equals(rect2));      
      System.out.println(rect1.equals(rect3));      
            
      System.out.println(rect1.equals(triangle));
      
      Square sq = new Square(5);
      Rectangle r = new Rectangle(5,5);
      System.out.println(sq.equals(r));
      System.out.println(r.equals(sq));
      
   }   
}
