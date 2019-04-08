package collections.collections_04;

import java.util.*;

public class TreeSetApplication {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      NavigableSet<String> words = new TreeSet<>();      
      String word = null;
      while(!(word = scanner.next()).equals(".")){
         words.add(word);         
      }
      
      for(String w: words) {
         System.out.println(w);
      }
      System.out.println("First word: " + words.first());
      System.out.println("Last word: " + words.last());
      scanner.close();
   }
}
