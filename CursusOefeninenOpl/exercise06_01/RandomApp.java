package exercise06_01;

import java.util.*;

public class RandomApp {
   public static void main(String[] args) {
      Random rand = new Random();
      System.out.println(rand.nextInt());
      System.out.println(rand.nextInt());
      System.out.println(rand.nextInt());
      System.out.println(rand.nextInt());

      System.out.println(rand.nextInt(100));
      System.out.println(rand.nextInt(100));
      System.out.println(rand.nextInt(100));
      System.out.println(rand.nextInt(100));
   }
}
