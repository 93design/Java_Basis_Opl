package streams_01;

import java.util.stream.Stream;

public class PersonStreamApp {

	public static void main(String[] args) {
		Person[] persons = { new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175),
				new Person("Marge", "Simpson", GenderType.FEMALE, 38, 65, 170),
				new Person("Bart", "Simpson", GenderType.MALE, 10, 30, 102),
				new Person("Lisa", "Simpson", GenderType.FEMALE, 8, 25, 95),
				new Person("Maggy", "Simpson", GenderType.FEMALE, 3, 15, 65) };
		Stream.of(persons)
			  //.filter(p -> p.getGender() == GenderType.FEMALE)
			
			  .forEach(System.out::println);
	}
}
