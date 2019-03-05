package be.intecbrussel.basis.exercise13_04;

import java.util.Scanner;

public interface KeyboardUtility {
   public static int readInt() {
      Scanner keyboard = new Scanner(System.in);
      int value = keyboard.nextInt();
      keyboard.close();
      return value;
   }
}
