package be.intecbrussel.basis.exercise08_03.graphics;

public class RectangleApp {
   public static void main(String[] args) {
      System.out.println("This program uses a rectangle");

      Rectangle rect1 = new Rectangle();

      rect1.width = 5;
      rect1.height = 7;
      rect1.x = 10;
      rect1.y = 20;

      System.out.println("Height: " + rect1.height);
      System.out.println("Width: " + rect1.width);
      System.out.println("X: " + rect1.x);
      System.out.println("Y: " + rect1.y);
      
      
      Rectangle rect2 = new Rectangle();

      rect2.width = 3;
      rect2.height = 2;
      rect2.x = 30;
      rect2.y = 40;

      System.out.println("Height: " + rect2.height);
      System.out.println("Width: " + rect2.width);
      System.out.println("X: " + rect2.x);
      System.out.println("Y: " + rect2.y);
      
      
   }
}
