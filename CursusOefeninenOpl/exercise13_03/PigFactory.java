package be.intecbrussel.basis.exercise13_03;

import java.util.Random;

public class PigFactory {
   
   private Random random = new Random();
   
   public Pig createPig() {
      if(random.nextBoolean()) {
         return new MyPig();
      }
      else {
         return new StrangePig();
      }
   }
}
