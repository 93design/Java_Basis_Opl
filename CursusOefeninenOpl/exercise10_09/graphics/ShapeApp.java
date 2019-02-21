package be.intecbrussel.basis.exercise10_09.graphics;

public class ShapeApp {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[10];
      shapes[0] = new Circle(3,2,5);
      shapes[1] = new Square(4,7,8);
      shapes[2] = new Rectangle(1,7,5,9);
      shapes[3] = new Rectangle(7,0,2,3);
      shapes[4] = new Square(3,5,8);
      shapes[5] = new Circle(12,6,23);
      shapes[6] = new Rectangle(9,8,4,9);
      shapes[7] = new Circle(0,6,1);
      shapes[8] = new Square(4,5,2);
      shapes[9] = new Square(2,7,9);
      
      for(Shape shape: shapes) {
         printShape(shape);
      }     
   }   
   
   public static void printShape(Shape s){
      if(s instanceof Circle) {
      	Circle circle = (Circle) s;
         System.out.print("Circle with radius " + circle.getRadius());         
      }
      else if (s instanceof Square) {
         System.out.print("Square with side " +
            ((Square)s).getSide());                  
      }
      else if (s instanceof Rectangle) {
         System.out.print("Rectangle with dimensions " +
            ((Rectangle)s).getHeight() + "x" +
            ((Rectangle)s).getWidth());                  
      } 
        
      System.out.print(" on position (" + s.getX() + "," +
      s.getY() + ")  ");
      System.out.print(" Area " + s.getArea());
      System.out.println(" Perimeter " + s.getPerimeter());  
   }
}
