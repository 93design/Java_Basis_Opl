package collections.collections_08;

import java.util.*;

public interface SortStrings {

   public static void main(String[] args) {
      List<String> words = new ArrayList<>();
      words.add("Hello");
      words.add("this");
      words.add("is");
      words.add("an");
      words.add("example");

      for(String w: words) {
         System.out.println(w);
      }
      
      words.sort((w,o) -> w.length()-o.length());
      
      //words.sort((Comparator.comparing(String::length)));
      
      for(String w: words) {
         System.out.println(w);
      }
      
   }

}
