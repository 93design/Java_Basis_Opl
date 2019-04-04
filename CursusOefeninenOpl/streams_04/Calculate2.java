package streams_04;

import java.util.Random;

public interface Calculate2 {

	public static void main(String... args) {
		// Generate 500 random even and unique numbers between 0 and 10000
	    // 
		Random rand = new Random();	
		int[] randomNumbers = rand.ints(0,10000)
		    .filter(e -> e % 2 == 0)
			 .distinct()
          .limit(500)
			 .sorted()
			 .toArray();
		
		for(int i: randomNumbers) {
			System.out.println(i);
		}
	}
}
