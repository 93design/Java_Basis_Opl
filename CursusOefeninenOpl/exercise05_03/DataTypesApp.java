package exercise05_03;

public class DataTypesApp {
	public static void main(String[] args) {
		boolean aBoolean = false;
		char aCharacter = 'd';
		byte aByte = 126;
		short aShortInteger = 1568;
		int anInteger = 1256456;
		long aLongInteger = 45631341L;
		float aDecimalNumber = 1256.32F;
		double aBigDecimalNumber = 12.365987451236;

		aByte = (byte) aShortInteger;

		System.out.println(aBoolean);
		System.out.println(aCharacter);
		System.out.println(aByte);
		System.out.println(aShortInteger);
		System.out.println(anInteger);
		System.out.println(aLongInteger);
		System.out.println(aDecimalNumber);
		System.out.println(aBigDecimalNumber);
	}
}
