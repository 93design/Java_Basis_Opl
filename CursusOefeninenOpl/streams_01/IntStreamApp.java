package streams_01;

import java.util.stream.IntStream;

public class IntStreamApp {

	public static void main(String[] args) {
		IntStream.range(0,100)
		         .forEach(System.out::println);	
	}
}
