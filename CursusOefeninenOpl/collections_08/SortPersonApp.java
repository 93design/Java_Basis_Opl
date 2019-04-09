package collections.collections_08;
import java.util.*;

public class SortPersonApp {
   public static void main(String[] args) {
      List<Person> persons = new ArrayList<>();
      Person person1 = new Person("Homer", "Simpson",
         GenderType.MALE, 43, 110, 175);
      Person person2 = new Person("Marge", "Simpson",
         GenderType.FEMALE, 38, 65, 170);
      Person person3 = new Person("Bart", "Simpson",
         GenderType.MALE, 10, 30, 102);
      Person person4 = new Person("Lisa", "Simpson",
         GenderType.FEMALE, 8, 25, 95);
      Person person5 = new Person("Maggy", "Simpson",
         GenderType.FEMALE, 3, 15, 65);
      Person person6 = new Person("Maggy", "Simpson",
         GenderType.FEMALE, 3, 15, 65);
      persons.add(person1);
      persons.add(person2);
      persons.add(person3);
      persons.add(person4);
      persons.add(person5);
      persons.add(person6);
      System.out.println("Natural order:");
      persons.sort(Comparator.naturalOrder());
      persons.forEach(System.out::println);
      System.out.println("Sorted by weight:");
      persons.sort(Comparator.comparingDouble(Person::getWeight));
      persons.forEach(System.out::println);
   }
}
