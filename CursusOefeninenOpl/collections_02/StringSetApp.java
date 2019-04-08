package collections.collections_02;

import java.util.*;

public class StringSetApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Set<String> words = new HashSet<String>();
      
      String word = null;
      do {         
         word = scanner.next();
         words.add(word);         
      }
      while(!word.endsWith("."));
      
      for(String w: words) {
         System.out.println(w);
      }
            
      System.out.println("Number of words: " + words.size());     
      
      String[] wa = words.toArray(new String[0]);
      for(String s: wa) {
         System.out.print(s + " ");
      }      
      
      scanner.close();
   }
}
