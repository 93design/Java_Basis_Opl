package DerekBanas;

import java.util.Arrays;

public class ArrayNedComment {
	
	public static void main(String[] args){

		// Een array is een variable die een verzameling van waardes
		// van hetzeflde type bevat.

		// Een array is zoals een grote doos met allemaal doosjes in.
		// elke doos heeft een index/nummer die je toegang heeft tot dewaarde in de doos

		/*
		 * Array Rules Een array kan enkel elementen van hetzelfde Type bevatten Een
		 * array kan niet veranderen van grote nadat deze de eerste keer bepaald is. Een
		 * array is een object
		 */

		// declareert een array met dataType[] arrayName
		int[] randomArray;

		// initaliseert een array
		// dataType[] arrayName = new dataType[sizeOfArray];

		int[] numberArray = new int[10];

		// verschillende manier om data aan een Array toe te voegen
			// individueel
	
			// Eerst defineren en lengte initalieseren en dan waardes toevoegen
			randomArray = new int[20];
			randomArray[1] = 2;
	
			// Je kan ook meteen een array meegeven in de vorm van:
			String[] stringArray = { "Just", "Random", "Words" };
	
			// Met loops
			// arrayName.length geeft je de lengte van de array(aantal elementen)
			for (int i = 0; i < numberArray.length; i++) {
				numberArray[i] = i;
			}
	
			// over array lopen en alle elementen eruit halen
			for (int j = 0; j < numberArray.length; j++) {
				System.out.print("|" + j + "");
			}
			System.out.println("|");
			
		drawLines();

		// Multidimensional Array
		// arrays in arrays [][]s

		String[][] multiDArray = new String[10][10];

		// waardes in een MultiDemArray pompen

		for (int i = 0; i < multiDArray.length; i++) {

			//lengte van de 2de array berekenen met [i].lenth()
			for (int j = 0; j < multiDArray[i].length; j++) {

				multiDArray[i][j] = i + " " + j;

			}

		}

		drawLines();

		// Prints out a multidimensional array with the values being the indexes

		for (int i = 0; i < multiDArray.length; i++) {

			for (int j = 0; j < multiDArray[i].length; j++) {

				System.out.print("| " + multiDArray[i][j] + " ");

			}
			System.out.println("|");

		}

		drawLines();
		// gebruik van for each
		for (int row : numberArray) {
			System.out.print(row);
		}
		System.out.println("\n");

		// for each voor multidementionele Array
		// for(dataType[] varForRow : arrayName)

		for (String[] rows : multiDArray) {
			// for(elementDataType varForColumn : varForRow)
			for (String column : rows) {
				System.out.print("| " + column + " ");
			}
			System.out.println("|");
		}

		// arrays kopieren op verschillende 
		// Arrays.copyOf(arrayToCopy, numberToCopyFromBeginning);

		int[] numberCopy = Arrays.copyOf(numberArray, 5);
		for (int num : numberCopy) {
			System.out.print(num);
		}
		System.out.println("\n");

		// You can copy an array from one index to another with copyOfRange
		// int[] numberCopy = Arrays.copyOf(numberArray, 1, 5);

		// You can print out the whole array with toString
		System.out.println(Arrays.toString(numberCopy));

		// Do define a default value for an array use fill
		// Arrays.fill(arrayName, valueToFill);
		// valueToFill must be the same for each element in the array

		int[] moreNumbers = new int[100];
		Arrays.fill(moreNumbers, 2);

		// Filling a multidimensional array
		char[][] boardGame = new char[10][10];
		for (char[] row : boardGame) {
			Arrays.fill(row, '*');
		}

		// You can sort an array using sort()
		int[] numsToSort = new int[10];

		// Generate array full of random numbers
		for (int i = 0; i < 10; i++) {
			numsToSort[i] = (int) (Math.random() * 100);
		}

		// Sort the array in ascending order
		Arrays.sort(numsToSort);

		System.out.println(Arrays.toString(numsToSort));

		// binarySearch returns the index for the searched for value
		// If it doesn't find it it returns a negative number

		int whereIs50 = Arrays.binarySearch(numsToSort, 50);

		System.out.println(whereIs50);
	}

	public static void drawLines() {
		// Draws 41 lines on the screen
		int k = 1;
		while (k <= 41) {
			System.out.print('-');
			k++;
		}
		System.out.println();
	}
}