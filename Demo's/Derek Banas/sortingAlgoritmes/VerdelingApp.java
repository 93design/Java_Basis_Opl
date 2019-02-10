package sortingAlgoritmes;

import java.util.Arrays;
import java.util.Random;

public class VerdelingApp {

	public static void main(String[] args) {
		Random myRandom = new Random();
		Integer[] myArray = myRandom.ints(1, 15)
                .boxed()
                .distinct()
                .limit(14L)
                .toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(myArray));

	}

}
