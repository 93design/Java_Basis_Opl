package streams_04;

import java.util.*;
import java.util.stream.Stream;

public class PersonFilterApp {

	public static void main(String[] args) {
		Person[] persons = { new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175),
		      new Person("Marge", "Simpson", GenderType.FEMALE, 38, 65, 170),
		      new Person("Bart", "Simpson", GenderType.MALE, 10, 30, 102),
		      new Person("Lisa", "Simpson", GenderType.FEMALE, 8, 25, 95),
		      new Person("Maggy", "Simpson", GenderType.FEMALE, 3, 15, 65) };

		Stream.of(persons)
		      .filter(p -> p.getGender() == GenderType.FEMALE)
		      .forEach(System.out::println);

		Stream.of(persons)
		      .filter(p -> p.getAge() > 10)
		      .forEach(System.out::println);

		Stream.of(persons)
            .filter(p -> p.getWeight() > 30)
            .filter(p -> p.getWeight() < 80)
            .forEach(System.out::println);

		Stream.of(persons)
            .filter(p -> p.getAge() > 30)
            .filter(p -> p.getWeight() > 80)
            .forEach(System.out::println);
		
		Stream.of(persons)
		      .mapToInt(Person::getAge)  // p -> p.getAge()
		      .forEach(System.out::println);
		
		Stream.of(persons)
            .map(p -> p.getFirstName() + " " + p.getLastName())
            .forEach(System.out::println);

		OptionalDouble avg = Stream.of(persons)
                                 .mapToInt(Person::getAge)
                                 .average();
		System.out.println(avg.isPresent()?avg.getAsDouble():"Not available");

		OptionalInt min = Stream.of(persons)
                              .mapToInt(Person::getAge)
                              .min();
      System.out.println(min.isPresent()?min.getAsInt():"Not available");

		OptionalInt max = Stream.of(persons)
                              .mapToInt(Person::getAge)
                              .max();
      System.out.println(max.isPresent()?max.getAsInt():"Not available");

		Stream.of(persons)
            .mapToDouble(Person::getWeight)
            .forEach(System.out::println);

      OptionalDouble avgWeight = Stream.of(persons)
                                       .mapToDouble(Person::getWeight)
                                       .average();
      System.out.println(avgWeight.isPresent()?avgWeight.getAsDouble():"Not available");

      OptionalDouble minWeight = Stream.of(persons)
                                    .mapToDouble(Person::getWeight)
                                    .min();
      System.out.println(minWeight.isPresent()?minWeight.getAsDouble():"Not available");

      OptionalDouble maxWeight = Stream.of(persons)
                        .mapToDouble(Person::getWeight)
                        .max();
      System.out.println(maxWeight.isPresent()?maxWeight.getAsDouble():"Not available");
	}
}
