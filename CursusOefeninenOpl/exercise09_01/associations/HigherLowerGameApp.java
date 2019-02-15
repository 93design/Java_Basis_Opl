package be.intecbrussel.basis.exercise09_01.associations;
import java.util.Scanner;

public class HigherLowerGameApp {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      HigherLowerGame game = new HigherLowerGame(20);
      System.out.println("Enter a number between 0 and 20");
      int result = 0;
      do {
         int guessValue = keyboard.nextInt();
         result = game.guess(guessValue);
         switch (result) {
         case 1:
            System.out.println("Lower!");
            break;
         case -1:
            System.out.println("Higher");
            break;
         case 0:
            System.out.println("Guessed!");
         }
      } while (result != 0);
      keyboard.close();
   }
}
