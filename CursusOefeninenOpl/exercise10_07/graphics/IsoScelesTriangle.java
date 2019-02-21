package be.intecbrussel.basis.exercise10_07.graphics;

public class IsoScelesTriangle extends Triangle {

   private static int count = 0;

   {
      count++;
   }
   
   public IsoScelesTriangle() {
      this(0,0,0,0);
   }
   
   public IsoScelesTriangle(int width, int height) {
      this(width,height,0,0);
   }
   
   public IsoScelesTriangle(int width, int height, int x, int y) {
      super(width,height,width/2,x,y);
   }
   
   public IsoScelesTriangle(IsoScelesTriangle tri){
      this(tri.getWidth(), tri.getHeight(), tri.getX(), tri.getY());
   }
   
   public void setWidth(int width){
      super.setWidth(width);
      super.setPerpendicular(width/2);
   }
   
   public void setPerpendicular(int perpendicular){
      super.setPerpendicular(perpendicular);
      super.setWidth(perpendicular*2);
   }
   
   public static int getCount() {
      return count;
   }
   
}

