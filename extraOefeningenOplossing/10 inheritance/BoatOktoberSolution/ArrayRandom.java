package BoatOktoberSolution;

import java.util.Arrays;
import java.util.Random;

public class ArrayRandom {

	public static void main(String[] args) {
		int[] numbers = new int[8];
		int sum = 0;
		int max = 0;
		int min = 0;
		Random rand = new Random();
		
		//edit jamie
		for (int i = 0; i < numbers.length; i++) {
			
			numbers[i] = rand.nextInt(42)+1;
		}
		System.out.println(Arrays.toString(numbers));
		int sumtotal= 0;
		
		for (int i = 0; i < numbers.length; i++) {
			sumtotal += numbers[i];
		}
		int minValue = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < minValue) {
				min = numbers[i];
			};
		}
		int maxValue = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > minValue) {
				min = numbers[i];
			};
		}
		
		
		System.out.println(sumtotal);
		
		
		//Sign for trouble
		//split up creation and Calculation
		for (int i = 0; i < numbers.length; i++) {
			int index = 1;
			numbers[i] = rand.nextInt(43);
			if (numbers[i] != numbers[index - 1]) {
				numbers[index++] = numbers[i];
				sum += numbers[i];
			}
			if (numbers[i] < min) {
				min = numbers[i];

			}
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		int numbers1[] = numbers;
		for (int k = 0; k < numbers1.length; k++) {
			int smallest = k;

			for (int j = k + 1; j < numbers1.length; j++) {

				if (numbers1[j] < numbers1[smallest]) {

					smallest = j;
				}
				int temp = numbers1[smallest];

				numbers1[smallest] = numbers1[k];

				numbers1[k] = temp;

			}
		}

		System.out.println(Arrays.toString(numbers));
		System.out.println(sum);
		System.out.println(max);
		System.out.println(min);
		System.out.println(Arrays.toString(numbers1));

	}

}
