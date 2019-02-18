package exercise10_06.graphics;

public class Square extends Rectangle {
   private static int count=0;

   {
      count++;
   }

   public static int getCount() {
      return count;
   }
   
   public Square() {    
      this(0,0,0);
   }
   
   public Square(int side) {
      this(side,0,0);
   }
   
   public Square(int side, int x, int y) {
      super(side,side,x,y);
   }
   
   public Square(Square square) {
      super(square);
   }

   public int getSide() {
      return getHeight();
   }

   public void setSide(int side) {
      super.setHeight(side);
      super.setWidth(side);
   }
   
   @Override
   public void setHeight(int height) {
      setSide(height);
   }

   @Override
   public void setWidth(int width) {
      setSide(width);
   }



}
