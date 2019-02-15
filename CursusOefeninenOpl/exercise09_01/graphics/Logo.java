package be.intecbrussel.basis.exercise09_01.graphics;

public class Logo {
   private Rectangle rect;
   private Circle circle;
   private String text;

   public Logo(Rectangle rect, Circle circle, String text) {
   	this.rect = rect;
   	this.circle = circle;
   	this.text = text;;
   }
      
   public Rectangle getRectangle() {
      return rect;
   }

   public Circle getCircle() {
      return circle;
   }

   public String getText() {
      return text;
   }
   
   public double getArea() {
      return rect.getArea() + circle.getArea();
   }   
   
}
