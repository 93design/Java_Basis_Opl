package exercise06_01;

import java.util.Random;

public class LottoApp {
   public static void main(String[] args) {
      Random rand = new Random();
      for(int i= 0; i < 6; i++) {
      	System.out.println(rand.nextInt(46));
      }
   }
}
