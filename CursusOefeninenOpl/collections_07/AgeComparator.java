package collections.collections_07;

import java.util.*;

public class AgeComparator implements Comparator<Person> {
   public int compare(Person p1, Person p2) {
      return p1.getAge() - p2.getAge() ;
   }
}
