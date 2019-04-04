package streams_04;

import java.util.stream.*;

public interface Calculate {
   public static void main(String... args) {
	   // Calculate the sum of the square roots of the first 
       // 20 numbers between 0 and 1.000 divisable by 5 and 8 
	   double sum = IntStream.rangeClosed(0, 1000)
	                         .filter(e -> e%8 == 0)
	                         .filter(e -> e%5 == 0)
	                         .limit(20)
	                         .mapToDouble(Math::sqrt)
	                         .sum();
	   System.out.println(sum);
    }
}
