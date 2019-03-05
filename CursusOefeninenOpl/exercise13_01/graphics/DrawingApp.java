package be.intecbrussel.basis.exercise13_01.graphics;

public class DrawingApp {   
   public static void main(String[] args) {
      Drawing drawing = new Drawing();
      
      drawing.add(new Rectangle(5,6));
      drawing.add(new Square(5));
      for(int i = 0; i< 356; i++) {
         drawing.add(new Circle(i));
      }

      System.out.println(drawing.getSize()); 
      
      drawing.remove(new Square(5));     
      drawing.remove(new Circle(200));
      System.out.println(drawing.getSize()); 
      drawing.clear();
      
      System.out.println(drawing.getSize()); 
            
   }   
}
