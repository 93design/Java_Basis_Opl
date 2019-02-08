package be.intecbrussel.basis.exercise07_04;
import java.util.*;

public class Scrabble {
   public static void main(String[] args) {
      // define lookup table
      int[] values = {1,3,5,2,1,4,3,4,1,4,3,3,3,1,1,3,10,2,2,2,4,4,5,8,8,4};     

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter a word: ");
      String text = keyboard.next();
      
      // First convert to lowercase
      char[] characters = text.toLowerCase().toCharArray();
      int total = 0;

      for(char c: characters) {
         // calculate index for each character
         int index = c - 'a';
         // check if index is within bounds
         if(index >=0 && index < values.length) {
            // get value from lookup table and add to total
            total += values[index];
         }
      }
      
      System.out.println("Word value: " + total);
      keyboard.close();
   }
}
