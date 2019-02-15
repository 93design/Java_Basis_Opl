package be.intecbrussel.basis.exercise08_08.graphics;

public class Rectangle {
   private int width;
   private int height;
   private int x;
   private int y;

   public Rectangle() {
      this(0,0,0,0);
   }
   
   public Rectangle(int width, int height) {
      this(width,height,0,0);
   }

   public Rectangle(Rectangle rect) {
      this(rect.width,rect.height,rect.x,rect.y);
   }

   public Rectangle(int width, int height, int x, int y) {
      setWidth(width);
      setHeight(height);
      setX(x);
      setY(y);
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
}
