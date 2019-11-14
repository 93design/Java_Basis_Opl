package exercise07_04;
import java.util.*;

public class Scrabble {
   public static void main(String[] args) {
      int[] values = {1,3,5,2,1,4,3,4,1,4,3,3,3,1,1,3,10,2,2,2,4,4,5,8,8,4};
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String text = keyboard.next();
      char[] characters = text.toLowerCase().toCharArray();
      int total = 0;
      for(char c: characters) {
         int index = c - 'a';
         if(index >=0 && index < values.length) {
            total += values[index];
         }
      }
      System.out.println("Word value: " + total);
      keyboard.close();
   }
}
