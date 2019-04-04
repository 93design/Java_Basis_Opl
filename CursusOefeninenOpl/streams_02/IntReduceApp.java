package streams_02;

import java.util.*;
import java.util.stream.IntStream;

public class IntReduceApp {

	public static void main(String[] args) {
		int[] numbers = {5,7,2,9,7,4};
		
		long count = IntStream.of(numbers)
		                      .count();
		System.out.println(count);
		
		OptionalInt min = IntStream.of(numbers)
		                           .min();		
		if(min.isPresent()) {
			System.out.println(min.getAsInt());
		}
		OptionalInt max = IntStream.of(numbers)
		                           .max();		
		if(max.isPresent()) {
			System.out.println(max.getAsInt());
		}
		
		OptionalDouble avg = IntStream.of(numbers)
		                              .average();		
		if(avg.isPresent()) {
			System.out.println(avg.getAsDouble());
		}
		
		int sum = IntStream.of(numbers)
         .sum();    
      System.out.println(sum);
  
		int sumSquare = IntStream.of(numbers)
		                         .reduce(0, (acc,el) -> acc + el*el);
		System.out.println(sumSquare);		
	}
}
