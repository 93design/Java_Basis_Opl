package lambdaStreams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;


/**
 * Created by Bext on 21/02/2017.
 */
public class CollectMap {
    public static List<Person> createPeople() {
        return Arrays.asList(
                new Person("Sara", Person.Sex.FEMALE, 20),
                new Person("Sara", Person.Sex.FEMALE, 22),
                new Person("Bob", Person.Sex.MALE, 20),
                new Person("Paula", Person.Sex.FEMALE, 32),
                new Person("Paul", Person.Sex.MALE, 32),
                new Person("Jack", Person.Sex.MALE, 2),
                new Person("Jack", Person.Sex.MALE, 27),
                new Person("Jill", Person.Sex.MALE, 12)
        );
    }

    public static void main(String[] args) {

        List<Person> persons = createPeople();

        //create a Map with name and age as key, and the person as value
        Map<String, Person> mapNameAge_Person = new HashMap<>();

       System.out.println(
               persons.stream()
               .collect(Collectors.toMap( p ->
                  p.getName() + " " + p.getAge(),
                  Function.identity()
               ))
       );

       mapNameAge_Person = persons.stream()
               .collect(Collectors.toMap( p ->
                               p.getName() + " " + p.getAge(),
                       Function.identity()
               ));
       System.out.println( mapNameAge_Person);

        System.out.println(
        persons.stream()
                .collect(Collectors.toMap(Person::getName,
                        Function.identity() ))
        );

        System.out.println(
                persons.stream()
                        .collect(Collectors.toSet())
        );

        System.out.println(
                persons.stream()
                        .collect(Collectors.groupingBy(Person::getName))
        );

        System.out.println(
                persons.stream()
                        .collect(Collectors.groupingBy(Person::getName,
                                Collectors.mapping(Person::getAge, Collectors.toList())))
        );
    }
}
