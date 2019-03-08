package Teacher;

import java.util.Arrays;
import java.util.Random;

public class LottoApp {
	public static void main(String[] args) {

		Random rand = new Random();
		int[] randArray = new int[8];
		//fill random
		for (int i = 0; i < randArray.length; i++) {
			randArray[i] = rand.nextInt(42) + 1;
			for (int j = 0; j < i; j++) {
				if (randArray[i] == randArray[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(randArray));
		//min
		int min = randArray[0];
		for (int i = 0; i < randArray.length; i++) {
			if (randArray[i] < min) {
				min = randArray[i];
			}
		}
		//max
		System.out.println("min is " + min);
		int max = randArray[0];
		for (int i = 0; i < randArray.length; i++) {
			if (randArray[i] > max) {
				max = randArray[i];
			}
		}

		System.out.println("max is " + max);

		//bubblesort
		for (int i = 0; i < randArray.length; i++) {
			for (int j = 1; j < (randArray.length - i); j++) {

				if (randArray[j - 1] > randArray[j]) {
					int temp = randArray[j - 1];
					randArray[j - 1] = randArray[j];
					randArray[j] = temp;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(randArray));
	}
}
