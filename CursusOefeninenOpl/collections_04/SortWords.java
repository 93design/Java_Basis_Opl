package collections.collections_04;

import java.util.*;

public interface SortWords {

   public static void main(String[] args) {
      NavigableSet<String> words = new TreeSet<>(Comparator.comparing(String::length));
      words.add("Hello");
      words.add("this");
      words.add("is");
      words.add("an");
      words.add("example");
      for(String w: words) {
         System.out.println(w);
      }
      System.out.println(words.higher("word"));
      System.out.println(words.lower("word"));
      System.out.println(words.ceiling("word"));
      System.out.println(words.floor("word"));
   }

}
