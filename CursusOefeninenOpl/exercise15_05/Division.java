package exercise15_05;

import java.util.*;

public class Division {
	public static void main(String args[]) {
      Scanner keyboard = new Scanner(System.in);
		try {
         int num = Integer.parseInt(keyboard.next());
         int den = Integer.parseInt(keyboard.next());
         int div = num / den;
         System.out.format("%d/%d=%d", num, den, div);
		} catch (RuntimeException exception) {
			System.out.println("Error");
			return;
		}		
		finally{
         keyboard.close();
			System.out.println("The End");			
		}
	}
}