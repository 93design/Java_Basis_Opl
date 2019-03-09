package sortingextra;


import java.io.*;
import java.util.Arrays;
 
class PancakeSort {
 
  public static void main(String[] args) {
 
    int[] arr = {3,6,8,7,7,5,4,2,2,1};
 
    System.out.println("Unsorted: " + Arrays.toString(arr));
    pancakeSort(arr);
    System.out.println("Sorted: " + Arrays.toString(arr));
  }
 
  public static void pancakeSort(int[] A){
    int max = 0;
    int j, index = 0;
 
    for (int i = 0; i < A.length; i++) {
      max = A[0];
      index = 0;
      for (j = 0; j < A.length - i; j++) {
        if (A[j] > max) {
          max = A[j];
          index = j;  
        }
      }
      flip(A, index, A.length - 1 - i);
    }
  }
 
  public static void flip(int[] A, int l, int r) {
    while (l <= r) {
      int temp = A[l];
      A[l] = A[r];
      A[r] = temp;
      l++;
      r--;
     
      printHorzArray(l, r, A);
      
    }
  }
  
  static void printHorzArray(int i, int j, int[] array) {

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < array.length; n++) {

			System.out.format("| %2s " + " ", n);

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < array.length; n++) {

			System.out.print(String.format("| %2s " + " ", array[n]));

		}

		System.out.println("|");

		for (int n = 0; n < 61; n++)
			System.out.print("-");

		System.out.println();

		if (i != -1) {

			// Number of spaces to put before the F

			int spacesBeforeFront = 5 * i + 1;

			for (int k = 0; k < spacesBeforeFront; k++)
				System.out.print(" ");

			System.out.print("l");

			// Number of spaces to put before the R

			int spacesBeforeRear = (5 * j + 1 - 1) - spacesBeforeFront;

			for (int l = 0; l < spacesBeforeRear; l++)
				System.out.print(" ");

			System.out.print("r");

			System.out.println("\n");

		}

	}
}