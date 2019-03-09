package extraOefeningen;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {

		int [] intArray = new int[] {1,2,3,4,5,6,7,8,9};
		int [] intArray2 = {7,6,9,1,4,8,5,3,2};
		
		int []reverseArray = new int[intArray.length];		
		int reverseIndex = 0;
		for (int i = intArray.length-1; i >= 0; i--) {
			reverseArray[reverseIndex] = intArray[i];
			reverseIndex++;
		}		
		System.out.println(Arrays.toString(reverseArray));
		
		

	}

}
