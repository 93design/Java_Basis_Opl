package collections.collections_08;

import java.util.*;

public class AgeComparator implements Comparator<Person> {
   public int compare(Person p1, Person p2) {
      int result = p1.getAge() - p2.getAge() ;
      return result==0?1:result;
   }
}
