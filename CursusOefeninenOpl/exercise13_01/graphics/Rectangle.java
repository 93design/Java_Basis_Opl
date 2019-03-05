package be.intecbrussel.basis.exercise13_01.graphics;

public class Rectangle extends Shape {

   private int width;
   private int height;
   public static final int ANGLES;
   private static int count;

   static {
      count = 0;
      ANGLES = 4;
   }

   {
      count++;
   }

   public Rectangle() {
      this(0, 0, 0, 0);
   }

   public Rectangle(int width, int height) {
      this(width, height, 0, 0);
   }

   public Rectangle(int width, int height, int x, int y) {
      super(x, y);
      setWidth(width);
      setHeight(height);
   }

   public Rectangle(Rectangle rect) {
      this(rect.width, rect.height, rect.getX(), rect.getY());
   }

   public void setWidth(int width) {
      this.width = (width < 0) ? -width : width;
   }

   public int getWidth() {
      return width;
   }

   public void setHeight(int height) {
      this.height = (height < 0) ? -height : height;
   }

   public int getHeight() {
      return height;
   }

   public void grow(int d) {
      width += d;
      height += d;
      if (width < 0)
         width = 0;
      if (height < 0)
         height = 0;
   }

   public double getArea() {
      return width * height;
   }

   public double getPerimeter() {
      return (width + height) * 2;
   }

   public static int getCount() {
      return count;
   }

   @Override
   public String toString() {
      return String.format(
            "Rectangle [width=%s, height=%s, x=%s, y=%s]", width,
            height, getX(), getY());
   }

   
   @Override
   public int hashCode() {
      final int prime = 31;
      int result = super.hashCode();
      result = prime * result + height;
      result = prime * result + width;
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
      Rectangle other = (Rectangle) obj;
      if (height != other.height)
         return false;
      if (width != other.width)
         return false;
      return true;
   }
}
