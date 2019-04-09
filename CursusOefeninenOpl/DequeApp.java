package collections.collections_06;

import java.util.*;

public class DequeApp {

   public static void main(String[] args) {
      Deque<String> persons = new ArrayDeque<>();
      persons.offerFirst("Homer");
      persons.offerFirst("Bart");
      persons.offerLast("Marge");
      persons.offerLast("Lisa");
      persons.offerLast("Maggy");
      while(persons.size()>=2) {
         System.out.printf("%s + %s%n", persons.pollFirst() , persons.pollLast());
      }
      if(persons.size() == 1) {
         System.out.printf("Left over: %s%n", persons.pollFirst());
      }
   }
}
