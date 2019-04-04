package streams_01;

import java.util.stream.Stream;

public class StringStreamApp {
	public static void main(String[] args) {
		String[] words = { "Hello", "this", "is", "an", "example", "of", "streams" };
		Stream.of(words)
		      //.forEach(System.out::println);
			.forEach(s -> System.out.print("==>" + s));
	}
}
