package be.intecbrussel.basis.exercise13_01.graphics;

public class Drawing{
   private final int MAX = 100;
   private Shape[] shapes = new Shape[MAX];
   private int size = 0;
   
   public void add(Shape s) {
      if(!isPresent(s)) {
      	int location = getFreeLocation(); 
         shapes[location] = s;      
         size++;
      }
   }
   
   public void remove(Shape s) {
      for(int i = 0; i < shapes.length; i ++) {
         if(s.equals(shapes[i])) {
            shapes[i] = null;
            size--;
            return;
         }
      }
   }
   
   public void clear() {
      shapes = new Shape[MAX];
      size = 0;
   }
   
   public int getSize() {
      return size;
   }

   /* Private methods */   
   private boolean isPresent(Shape s) {
      for(Shape shape: shapes){
         if(s.equals(shape)) return true;
      }
      return false;
   }
   
   private int getFreeLocation() {
      for(int i = 0; i < shapes.length; i++){
         if(shapes[i] == null) return i;
      }      
      // Create new array
      Shape[] temp = new Shape[shapes.length + MAX];
      for(int i = 0; i < shapes.length; i++){
         temp[i] = shapes[i];
      }
      int location = shapes.length;
      shapes = temp;
      
      return location;
   }   
}
