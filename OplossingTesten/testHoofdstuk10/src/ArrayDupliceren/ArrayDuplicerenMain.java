package ArrayDupliceren;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArrayDuplicerenMain {
	
	public static void main(String [] args) {

		int[] intArray = new int[20];
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = i +1;		
		}
		
		System.out.println(Arrays.toString(intArray));
		
		int[] reverseArray = reverseArray(intArray);
		
		System.out.println(Arrays.toString(reverseArray));
		
		int [] kwadraatArray = kwadraatArray(intArray);
		
		
		System.out.println(Arrays.toString(kwadraatArray));
		
		Random rand = new Random();
		int [] randomArray = new int[20];
		
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = rand.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(randomArray));
		
		Arrays.sort(randomArray);
		System.out.println(Arrays.toString(randomArray));
	}
	
	
	public static int [] reverseArray(int[] arrayIn) {
		
		int[] temp = new int[arrayIn.length]; 
		int j = 0;
		for (int i = arrayIn.length-1; i >=0; i--) {
				temp[j++] = arrayIn[i];
			}				
		return temp;
	}
	
	
	public static int [] kwadraatArray(int [] arrayIn) {
		
		int [] temp = new int[arrayIn.length];
		for (int i = 0; i < arrayIn.length; i++) {
			//temp[i] = arrayIn[i] * arrayIn[i];
			temp[i] = (int) Math.pow(arrayIn[i], 2);
		}		
		return temp;
	}
	
	
	
}
