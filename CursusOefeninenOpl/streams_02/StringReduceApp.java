package streams_02;

import java.util.stream.Stream;

public class StringReduceApp {

	public static void main(String[] args) {
      String[] words = {"Hello","this","is","an","example","of","streams"};
      String result = Stream.of(words)
                            .reduce("", (acc,el) -> acc + el + ";");
      System.out.println(result);
	}
}
