package be.intecbrussel.basis.exercise13_03;
import java.util.Random;

public interface Pig {
   public static Pig createPig() {
      Random random = new Random();
      if(random.nextBoolean()) {
         return new MyPig();
      }
      else {
         return new StrangePig();
      }      
   }
   public void grunt();

   public default void fly() {
      System.out.println("Yes pigs can fly");
   }   
}
