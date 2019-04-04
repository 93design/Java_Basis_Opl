package streams_03;

import java.util.stream.Stream;

public class PersonCollectApp {

	public static void main(String[] args) {
		Person[] persons = {new Person("Homer", "Simpson", GenderType.MALE, 43, 110, 175),
				              new Person("Marge", "Simpson", GenderType.FEMALE,38,65, 170),
				              new Person("Bart", "Simpson", GenderType.MALE,10, 30,102),
				              new Person("Lisa", "Simpson", GenderType.FEMALE,8, 25,95),
				              new Person("Maggy", "Simpson", GenderType.FEMALE,3, 15,65)};
		
		Person[] persons2 = Stream.of(persons).toArray(Person[]::new);
		
		Stream.of(persons2).forEach(System.out::println);
	}
}
