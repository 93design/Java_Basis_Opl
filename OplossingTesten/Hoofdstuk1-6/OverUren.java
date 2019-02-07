package be.intecbrussel.test_basis;

import java.util.Scanner;

public class OverUren {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("geef uw uren");
		int urenIn = input.nextInt();
		System.out.println("geef uw uren");
		int overUrenIn = input.nextInt();
		System.out.println("geef uw BrutoLoon");
		int bruto = input.nextInt();
		double overMulti = 1.5;

		double totaal = 0;
		double gewoonTotaal = urenIn * bruto;
		double overTotaal = overUrenIn * bruto * overMulti;

		totaal = gewoonTotaal + overTotaal;

		System.out.println(totaal);

	}

}