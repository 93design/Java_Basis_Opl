package be.intecbrussel.basis.exercise08_11;

public class MathApp {

   public static void main(String[] args) {
      for(float angle = 0; angle <= (2*Math.PI); angle+=0.1) {
         System.out.printf("%.1f %.0f %.2f%n", angle,Math.toDegrees(angle),Math.cos(angle));        
      }      
   }
}
