package be.intecbrussel.basis.exercise09_01.associations;

import java.util.*;

public class HigherLowerGame {

   private int value;
   private int max;
   private Random rand;

   public HigherLowerGame(int max) {
      this.max = max;
      rand = new Random();
      reset();
   }

   public void reset() {
      value = rand.nextInt(max + 1);
   }

   public int guess(int guessValue) {
      if (guessValue < value) {
         return -1;
      } else if (guessValue > value) {
         return 1;
      } else {
         return 0;
      }
   }
}
