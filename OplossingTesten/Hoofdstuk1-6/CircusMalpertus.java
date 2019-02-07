package be.intecbrussel.test_basis;

import java.util.Scanner;

public class CircusMalpertus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("Malpertus:");
		System.out.print("Basisprijs voorstelling: ");
		double prijs = in.nextDouble();
		int day = getInputDay();
		int show = getInputShow();
		System.out.println("leeftijd klant");
		int age = in.nextInt();

		if (show == 1) {
			System.out.println("reductie Namiddag voorstelling");
			prijs = prijs - (prijs * 0.15);
		}

		switch (day) {
		case 3:
			if (show == 1 && age < 12) {
				prijs = prijs / 50;
			}
			break;
		case 6:	case 7:
			if (age < 12) {
				prijs = prijs / 50;
			}
			break;
		default:
			if (age < 12) {
				prijs = 0;
			}
			break;
		}

		if (age > 60) {
			System.out.println("leeftijdsReductie 30%");
			prijs = prijs - (prijs * 0.3);
		}

		System.out.println("de prijs van uw ticket is " + prijs);

	}

	public static int getInputDay() {
		Scanner in = new Scanner(System.in);
		System.out.print("voor welke dag (1=maandag to 7 = zondag): ");
		int day = 0;
		boolean input = false;
		while (!input) {
			day = in.nextInt();
			if (day < 0 || day > 8) {
				input = false;
				System.out.println("Gelieve een dag te kiezen tussen 0 en 7");

			} else
				input = true;
		}
		return day;
	}

	public static int getInputShow() {
		Scanner in = new Scanner(System.in);
		System.out.print("voor welke schow (1=namiddag to 2 = avond): ");
		int show = 0;
		boolean input = false;
		while (!input) {
			show = in.nextInt();
			if (show < 0 || show > 8) {
				input = false;
				System.out.println("Gelieve een voorstelling te kiezen tussen 1 en 2");

			} else
				input = true;
		}
		return show;
	}
}
