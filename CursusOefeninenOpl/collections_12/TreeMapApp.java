package collections.collections_12;

import java.util.*;

public class TreeMapApp {
   public static void main(String[] args) {
      NavigableMap<String,Person> persons = new TreeMap<>();
      Person person1 = new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175);
      Person person2 = new Person("Marge", "Simpson", GenderType.FEMALE,38,65, 170);
      Person person3 = new Person("Bart", "Simpson", GenderType.MALE,10, 30,102);
      Person person4 = new Person("Lisa", "Simpson", GenderType.FEMALE,8, 25,95);
      Person person5 = new Person("Maggy", "Simpson", GenderType.FEMALE,3, 15,65);
      persons.put(person1.getFirstName(),person1);
      persons.put(person2.getFirstName(),person2);
      persons.put(person3.getFirstName(),person3);
      persons.put(person4.getFirstName(),person4);
      persons.put(person5.getFirstName(),person5);
      
      for(String name: persons.keySet()) {
         System.out.println(persons.get(name));
      }
      
      System.out.println(persons.get("Homer"));
      System.out.println(persons.get(persons.firstKey()));
      System.out.println(persons.get(persons.lastKey()));
   }
}
