package be.intecbrussel.basis.exercise10_10.graphics;

public abstract class Shape {
   private int x;
   private int y;
   private static int count = 0;

   {
      count++;
   }

   public Shape() {
      this(0, 0);
   }

   public Shape(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public void setX(int x) {
      this.x = x;
   }

   public int getX() {
      return x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int getY() {
      return y;
   }

   public void setPosition(int x, int y) {
      this.x = x;
      this.y = y;
   }

   public static int getCount() {
      return count;
   }

   public abstract double getArea();

   public abstract double getPerimeter();

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + x;
      result = prime * result + y;
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Shape other = (Shape) obj;
      if (x != other.x)
         return false;
      if (y != other.y)
         return false;
      return true;
   }   
}
