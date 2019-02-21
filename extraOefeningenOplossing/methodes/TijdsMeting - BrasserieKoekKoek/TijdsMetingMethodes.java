package be.intecBrussel.brasserieApp;

import java.util.Scanner;

public class TijdsMetingMethodes {
	public static void main(String[] arg) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("geef uw start uur in");
		double startUur = keyboard.nextDouble();
		System.out.println("geef uw start minuten in");
		double startMinuten = keyboard.nextDouble();

		System.out.println("geef uw stop uur in");
		double stopUur = keyboard.nextDouble();
		System.out.println("geef uw stop minuten in");
		double stopMinuten = keyboard.nextDouble();

		double totaalUur = 0;
		double totaalMinuten = (60 - startMinuten) + stopMinuten;

		if (totaalMinuten >= 60) {
			totaalMinuten = totaalMinuten - 60;
		}

		// uren bereken rond 24u
		if (stopUur < startUur) {
			// eerste daguren
			double urenDag1 = 24 - (startUur);
			totaalUur = urenDag1 + stopUur;
		} else {
			totaalUur = stopUur - startUur;
		}

		System.out.println("totaaluur =" + totaalUur);
		System.out.println("totaalmintuen =" + totaalMinuten);

		// betaling weekends
		System.out.println("geef de dag van de week in 1-7");
		int startDag = keyboard.nextInt();

		double betaling = 0;
		double weekLoon = 11.5;
		double zatLoon = 14.375;
		double zonLoon = 17.25;

		switch (startDag) {
		case 1:
		case 2:
		case 3:
		case 4:
			betaling = betalingGewoneDag(totaalMinuten, totaalUur, weekLoon);
			System.out.println("u heeft voor deze prestatie in de week €" + betaling + " verdiend");
			break;
		case 5:

			System.out.println("u heeft voor deze prestatie op vrijdag en (zaterdag) €" + betaling + "verdiend");
			break;
		case 6:
			if (stopUur < startUur) {
				betaling = Nachtwerk(startMinuten, startUur, stopMinuten, stopUur, zatLoon, zonLoon);
			} else {
				betaling = betalingGewoneDag(totaalMinuten, totaalUur, zatLoon);
			}
			System.out.println("u heeft voor deze prestatie op vrijdag en (zaterdag) €" + betaling + "verdiend");
			break;
		case 7:
			if (stopUur < startUur) {
				betaling = Nachtwerk(startMinuten, startUur, stopMinuten, stopUur, zonLoon, weekLoon);
			} else {
				betaling = betalingGewoneDag(totaalMinuten, totaalUur, zatLoon);
			}
			System.out.println("u heeft voor deze prestatie op vrijdag en (zaterdag) €" + betaling + "verdiend");
			break;
		default:
			System.out.println("Verkeerde invoer");
		}
	}

	private static double betalingGewoneDag(double totaalMinuten, double totaalUur, double bedrag) {
		// betaling minuten
		double geldMinuten = ((double) totaalMinuten / 60) * bedrag;
		double geldUur = totaalUur * bedrag;
		double betaling = geldMinuten + geldUur;

		return betaling;
	}

	private static double Nachtwerk(double startMinuten, double startUur, double stopMinuten, double stopUur,
			double bedrag1, double bedrag2) {
		// betaling vrijdag
		double geldMinutenWeek = (double) (60 - startMinuten) / 60;
		double geldUrenWeek = 24 - startUur;

		double vrijdag = betalingGewoneDag(geldMinutenWeek, geldUrenWeek, bedrag1);

		// betaling zaterdag
		double geldMinutenZat = ((double) (60 - stopMinuten) / 60);
		double geldUrenZat = stopUur;

		double zaterdag = betalingGewoneDag(geldMinutenZat, geldUrenZat, bedrag2);
		double betaling = vrijdag + zaterdag;
		return betaling;
	}
}