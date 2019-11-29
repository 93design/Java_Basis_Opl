package ArrayOefeningOktober;

import java.util.Arrays;

public class arrayApp {
	
	public static void main (String arg[]) {
		
		int [] arrayA = {5,8,16,12,10,7,1,9,16,14,12,20,3,14,17,1,19,6,4,20};
		
		
		//sum of the Array 
		//loop over array and add to sum variable
		int sum = 0;
		for (int i = 0; i <arrayA.length; i++) {
			//sum = sum + arrayA[i];
			sum += arrayA[i];
		}		
		System.out.println("sum = " + sum);
		System.out.println(Arrays.toString(arrayA));
		
		
		//reversing an array
		//meerdere manieren
		//hier lopen over array en gebruik maken van de lengte van de bestaande array
		//Hiervan 1 aftrekken heeft ons de laaste variable. 
		
		//kort
		int temp[] = new int[arrayA.length];		
		for (int i = 0; i < arrayA.length; i++) {
			temp[i] = arrayA[arrayA.length-i-1];			
		}
		
		//long way Reverse
		int lengte = arrayA.length; 
		int tempLong[] = new int[lengte];		
		for (int i = 0; i < arrayA.length; i++) {
			int tempInt = arrayA[lengte-1-i];
			tempLong[i] = tempInt;			
		}
		System.out.println(Arrays.toString(temp));
		
		//Kwadraat van de array
		int tempSquare[] = new int[lengte];	
		for (int i = 0; i < arrayA.length; i++) {
			tempSquare[i] = arrayA[i] * arrayA[i];			
		}	
		System.out.println(Arrays.toString(tempSquare));
		
		//Kwadraat van de array 
		//via math
		int tempSquare2[] = new int[lengte];	
		for (int i = 0; i < arrayA.length; i++) {
			tempSquare2[i] = (int) Math.pow(arrayA[i], 2);	
		}
		
		//via Math
		System.out.println(Arrays.toString(tempSquare2));
	}

}
