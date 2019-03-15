package graphics;

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
      if (width < 0)
         throw new NegativeSizeException("Negative width");
      this.width = width;
   }

   public int getWidth() {
      return width;
   }

   public void setHeight(int height) {
      if (height < 0)
         throw new NegativeSizeException("Negative height");
      this.height = height;
   }

   public int getHeight() {
      return height;
   }

   public void grow(int d) {
      if (height < -d)
         throw new NegativeSizeException(
            "Grow to negative height");
      if (width < -d)
         throw new NegativeSizeException("Grow to negative width");
      width += d;
      height += d;
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

  

   public void scale(int factor) {
      double f = Math.sqrt(factor) / 10;
      height = (int) (height * f);
      width = (int) (width * f);
   }
}
