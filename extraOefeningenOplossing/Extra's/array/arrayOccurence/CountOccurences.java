package arrayOccurence;

import java.util.Arrays;
import java.util.Scanner;

public class CountOccurences {

	public static void main(String[] args) {
		final int MAX_LENGTH = 6;
		Scanner key = new Scanner(System.in);
		int[] array = new int[MAX_LENGTH];
		int i = 0;

		while (i < MAX_LENGTH) {
			array[i] = key.nextInt();
			i++;
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j] + ", ");
		}

		int max = 0;
		int maxCount = 1;
		for (int j = 0; j < array.length; j++) {
			if (array[j] >= max) {
				if (max == array[j]) {
					maxCount++;
				} else {
					max = array[j];
					maxCount = 1;
				}
			}
		}
		
		System.out.println("Max number: " + max + " occurence: " + maxCount);
	}
}
