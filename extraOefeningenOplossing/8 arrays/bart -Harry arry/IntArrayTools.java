package be.bartcoding.arrays;

public class IntArrayTools {
private IntArrayTools(){}
public static int[] sort(int[] intArray){
	boolean sorted = false;
	while (!sorted) {
		sorted = true;
		for (int i = 0; i < (intArray.length - 1); i++) {

			if (intArray[i] > intArray[i + 1]) {
				int temp = intArray[i];
				intArray[i] = intArray[i + 1];
				intArray[i + 1] = temp;
				sorted = false;
			}
		}
	}
	return intArray;
}
public static boolean isSorted(int[] intArray){
	for(int i=1;i<intArray.length;i++){
		if(intArray[i-1]>intArray[i]){
			return false;
		}
	}
	return true;
}
public static boolean chopSearch(int[] intArray){
	boolean found = false;
	
	while(!found){
		
	}
	return found;
}
}
