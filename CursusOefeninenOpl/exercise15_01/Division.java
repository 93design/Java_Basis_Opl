package exercise15_01;

import java.util.*;

public class Division {
	public static void main(String args[]) {
	   Scanner keyboard = new Scanner(System.in);	   
		int num = Integer.parseInt(keyboard.next());
		int den = Integer.parseInt(keyboard.next());
		int div = num / den;
		System.out.format("%d/%d=%d", num,den,div);
		keyboard.close();
	}
}