package Oplossing;

import java.util.Scanner;

public class LussenOefening5Lidgeld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Age: ");
		int age = input.nextInt();
		System.out.print("Kids: ");
		int numKids = input.nextInt();
		System.out.print("Annual Income: ");
		int anIncome = input.nextInt();

		final double START_FEE = 10;
		final int AGE_REDUX = 2;
		final int KID_REDUX = 1;
		final double INCOME_REDUX = 2.5;
		final double MAX_REDUX = 8.5;
		double fee = START_FEE;
		if (age > 50) {
			System.out.println("Age discount: " + AGE_REDUX);
			fee -= AGE_REDUX;
		}
		
		for (; numKids > 0; numKids--) {
			if (numKids > 5) {
				numKids = 0;
				fee-=5;
			} else {
				System.out.println("childDiscount");
				fee -= KID_REDUX;
			}
			
		}

		if (anIncome < 12500) {
			System.out.println("Anual income discount");
			fee -= INCOME_REDUX;
		}

		if (fee < 10 - MAX_REDUX) {
			System.out.println("max redux achieved");
			fee = 1.5;
		}

		System.out.println("Your annual fee is:" + fee);
	}

}
