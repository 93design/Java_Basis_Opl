package be.intecbrussel.basis.exercise10_09.graphics;

public class Circle extends Shape {

   private int radius;
   public static final int ANGLES = 0;
   private static int count = 0;

   {
      count++;
   }

   public Circle() {
      this(0, 0, 0);
   }

   public Circle(int radius) {
      this(radius, 0, 0);
   }

   public Circle(int radius, int x, int y) {
      super(x, y);
      setRadius(radius);
   }

   public Circle(Circle circ) {
      this(circ.radius, circ.getX(), circ.getY());
   }

   public void setRadius(int radius) {
      this.radius = (radius < 0) ? -radius : radius;
   }

   public int getRadius() {
      return radius;
   }

   public void grow(int dr) {
      radius += dr;
      if (radius < 0)
         radius = 0;
   }

   public double getArea() {
      return Math.PI * radius * (double) radius;
   }

   public double getPerimeter() {
      return 2 * Math.PI * (double) radius;
   }

   public static int getCount() {
      return count;
   }

   @Override
   public String toString() {
      return String.format("Circle [radius=%s, x=%s, y=%s]", radius, getX(),
            getY());
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + radius;
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (!super.equals(obj))
         return false;
      if (getClass() != obj.getClass())
         return false;
      Circle other = (Circle) obj;
      if (radius != other.radius)
         return false;
      return true;
   }   
}
