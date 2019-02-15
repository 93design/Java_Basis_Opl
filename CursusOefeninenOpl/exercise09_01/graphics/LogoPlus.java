package be.intecbrussel.basis.exercise09_01.graphics;

public class LogoPlus {
   private Rectangle[] rectangles;
   private Circle[] circles;
   private String text;

   public LogoPlus(Rectangle[] rect, Circle[] circle, String text) {
      this.rectangles = rect;
      this.circles = circle;
      this.text = text;
   }

   public Rectangle[] getRectangles() {
      return rectangles;
   }

   public Circle[] getCircles() {
      return circles;
   }

   public String getText() {
      return text;
   }

   public double getArea() {
      double area = 0;
      for (Rectangle r : rectangles) {
         area += r.getArea();
      }
      for (Circle c : circles) {
         area += c.getArea();
      }
      return area;
   }
}
