package exercise05_18;

import java.util.Scanner;

@SuppressWarnings("resource")
public class KeyboardUtility {
   public static int readInt() {
      Scanner keyboard = new Scanner(System.in);
      int value = keyboard.nextInt();
      return value;
   }
   
   public static float readFloat() {
      Scanner keyboard = new Scanner(System.in);
      float value = keyboard.nextFloat();
      return value;
   }
}
