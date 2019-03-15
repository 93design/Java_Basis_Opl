package graphics;

public class DrawingApp {   
   public static void main(String[] args) {
      Drawing drawing = new Drawing();      
      drawing.add(new Rectangle(5,6));
      drawing.add(new Square(5));
      drawing.add(new Triangle(4,8,6));
      drawing.add(new IsoScelesTriangle(7,8));
      try {
    	  drawing.add(new Circle(-7));
      } catch(NegativeSizeException nse) {
    	  System.out.println(nse.getMessage());
      }
            
      for(Object s: drawing.getDrawables()) {
         System.out.println(s);
      }

    
   }   
}
