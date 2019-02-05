package exercise05_10;

public class Assignment {
	public static void main(String[] args) {
		int number1 = 570;
		int number2 = 33;
		System.out.println("number1 : " + number1);
		System.out.println("number2 : " + number2);
		number1+=number2;
		System.out.println("number1 += number2 -> number1: " + number1);
		number1-=number2;
		System.out.println("number1 -= number2 -> number1: " + number1);
		number1*=number2;
		System.out.println("number1 *= number2 -> number1: " + number1);
		number1/=number2;
		System.out.println("number1 /= number2 -> number1: " + number1);
		number1%=number2;
		System.out.println("number1 %= number2 -> number1: " + number1);
		number1&=number2;
		System.out.println("number1 &= number2 -> number1: " + number1);
		number1|=number2;
		System.out.println("number1 |= number2 -> number1: " + number1);
		number1^=number2;
		System.out.println("number1 ^= number2 -> number1: " + number1);
      number1<<=number2;
      System.out.println("number1 <<= number2 -> number1: " + number1);
		number1>>=number2;
		System.out.println("number1 >>= number2 -> number1: " + number1);
		number1>>>=number2;
		System.out.println("number1 >>>= number2 -> number1: " + number1);
	}
}
