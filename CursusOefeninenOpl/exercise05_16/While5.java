package exercise05_16;
import java.util.*;

public class While5 {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int value;
      do {
         System.out.println("Enter number between 0 and 10: ");
         value = keyboard.nextInt();
      } while (value < 0 || value > 10);
      System.out.println("You entered :" + value);
      keyboard.close();
   }
}