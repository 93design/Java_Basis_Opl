package exercise10_04.graphics;

public class Polymorphism {

   public static void main(String[] args) {
      Rectangle rect1 = new Rectangle();
      Rectangle rect2 = new Square();      
      rect1.setWidth(5);;
      rect2.setWidth(6);      
      System.out.println(rect1.getHeight());
      System.out.println(rect2.getHeight());
   }
}
