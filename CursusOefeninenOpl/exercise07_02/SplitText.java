package exercise07_02;

import java.util.*;

public class SplitText {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      String text = keyboard.nextLine();
      for(String word: text.split(" ")) {
         System.out.println(word);
      }

   }

}
