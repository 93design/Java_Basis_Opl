package exercise05_08;

public class Shift {
	public static void main(String[] args) {
		byte number1 = 1;
		byte number2 = 1;
		byte number3 = -5;

		System.out.println("number1   : " + number1);
		System.out.println("number2   : " + number2);
		System.out.println("number3   : " + number3);
		System.out.println("number1 >> number2   : " + (number1 >> number2));
		System.out.println("number3 >> number2   : " + (number3 >> number2));
		System.out.println("number3 << number2   : " + (number3 << number2));
		System.out.println("number1 << number2   : " + (number1 << number2));
		System.out.println("number1 >>> number2  : " + (number1 >>> number2));
		System.out.println("number3 >>> number2  : " + (number3 >>> number2));
		System.out.println("number1 >> number3   : " + (number1 >> number3));
		System.out.println(1 << -1);
	}
}