package exercise05_04;
import java.util.*;

public class Arithmetic {
	public static void main(String[] args) {
	   Scanner keyboard = new Scanner(System.in);
	   System.out.println("Enter the first number:");		
	   int number1 = keyboard.nextInt();
      System.out.println("Enter the second number:");      
		int number2 = keyboard.nextInt();
		char c = 'a';
		
		System.out.println("The first number is : " + number1);
		System.out.println("The second number is: " + number2);
		System.out.println("The sum is          : " + (number1 + number2));
		System.out.println("The difference is   : " + (number1 - number2));
		System.out.println("The product is      : " + (number1 * number2));
		System.out.println("The division is     : " + (number1 / number2));
		System.out.println("The modulo is       : " + (number1 % number2));
		System.out.println("The first number +1 : " + (++number1));
		System.out.println("The second number -1: " + (--number2));
      System.out.println("The first number +1 : " + (number1++));
      System.out.println("The second number -1: " + (number2--));
      System.out.println("The character c     : " + c);
      System.out.println("The character c++   : " + c++);
      System.out.println("The character c     : " + c);     
      
      keyboard.close();      
	}
}