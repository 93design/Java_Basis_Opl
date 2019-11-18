package be.intecBrussel.brasserieApp;

import java.util.Scanner;

public class TijdsMeting {

	public static void main(String[] arg) {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("geef uw start uur in");
		int startUur = keyboard.nextInt();
		System.out.println("geef uw start minuten in"); 
		int startMinuten = keyboard.nextInt();

		System.out.println("geef uw stop uur in");
		int stopUur = keyboard.nextInt();
		System.out.println("geef uw stop minuten in");
		int stopMinuten = keyboard.nextInt();

		int totaalUur = 0;
		int totaalMinuten = (60 - startMinuten) + stopMinuten;

		// eerst minuten berekenen
		if (totaalMinuten >= 60) {
			totaalUur++;
			totaalMinuten -= 60;
		}

		// uren bereken rond 24u
		if (stopUur < startUur) {
			// eerste daguren
			int urenDag1 = 24 - (startUur);
			totaalUur = urenDag1 + stopUur;
		} else {
			totaalUur = stopUur - startUur;
		}

		System.out.println("totaaluur =" + totaalUur);
		System.out.println("totaalmintuen =" + totaalMinuten);

		// betaling weekends
		System.out.println("geef de dag van de week in 1-7");
		int startDag = keyboard.nextInt();

		double geldMinutenWeek = 0;
		double geldUrenWeek = 0;

		double geldMinutenZat = 0;
		double geldUrenZat = 0;

		double geldMinutenZon = 0;
		double geldUrenZon = 0;

		double betaling = 0;
		double geldMinuten = 0;
		double geldUur = 0;

		switch (startDag) {
		case 1:
		case 2:
		case 3:
		case 4:

			// betaling minuten
			geldMinuten = ((double) totaalMinuten / 60) * 11.5;
			geldUur = totaalUur * 11.5;
			betaling = geldMinuten + geldUur;

			System.out.println("u heeft voor deze prestatie €" + betaling + "verdiend");
			break;
		case 5:

			if (stopUur < startUur) {
				// betaling vrijdag
				geldMinutenWeek = ((double) (60 - startMinuten) / 60) * 11.5;
				geldUrenWeek = (24 - startUur) * 11.5;

				// betaling zaterdag
				geldMinutenZat = ((double) (60 - stopMinuten) / 60) * 14.375;
				geldUrenZat = stopUur * 14.375;

				System.out.println(geldMinutenWeek + " " + geldUrenWeek + " " + geldMinutenZat + " " + geldUrenZat);

				betaling = geldMinutenWeek + geldUrenWeek + geldMinutenZat + geldUrenZat;
				System.out.println("u  op vrijdag en (zaterdag) €" + betaling + "verdiend");

			} else {
				// betaling minuten
				geldMinuten = ((double) totaalMinuten / 60) * 11.5;
				geldUur = totaalUur * 11.5;
				betaling = geldMinuten + geldUur;

				System.out.println("u heeft €" + betaling + "verdiend");
			}

			break;
		case 6:
			if (stopUur < startUur) {
				// betaling Zat
				geldMinutenZat = ((double) (60 - startMinuten) / 60) * 14.375;
				geldUrenZat = (24 - startUur) * 14.375;

				// betaling zaterdag
				geldMinutenZon = ((double) (60 - stopMinuten) / 60) * 17.25;
				geldUrenZon = stopUur * 17.25;

				System.out.println(geldMinutenZat + " " + geldUrenZat + " " + geldMinutenZon + " " + geldUrenZon);

				betaling = geldMinutenZat + geldUrenZat + geldMinutenZon + geldUrenZon;
				System.out.println("u heeft zaterdag en (zondag) €" + betaling + "verdiend");

			} else {
				// betaling minuten
				geldMinuten = ((double) totaalMinuten / 60) * 14.375;
				geldUur = totaalUur * 14.375;
				betaling = geldMinuten + geldUur;

				System.out.println("u heeft  €" + betaling + "verdiend");
			}
			break;
		case 7:
			if (stopUur < startUur) {
				// betaling Zon
				geldMinutenZon = ((double) (60 - startMinuten) / 60) * 17.25;
				geldUrenZon = (24 - startUur) * 17.25;

				// betaling zaterdag
				geldMinutenWeek = ((double) (60 - stopMinuten) / 60) * 11.5;
				geldUrenWeek = stopUur * 11.5;

				System.out.println(geldMinutenZon + " " + geldUrenZon + " " + geldMinutenWeek + " " + geldUrenWeek);

				betaling = geldMinutenZon + geldUrenZon + geldMinutenWeek + geldUrenWeek;
				System.out.println("u heeft  zondag en maandag €" + betaling + "verdiend");

			} else {
				// betaling minuten
				geldMinuten = ((double) totaalMinuten / 60) * 17.25;
				geldUur = totaalUur * 17.25;
				betaling = geldMinuten + geldUur;

				System.out.println("u heeft zondag€" + betaling + "verdiend");
			}
			break;
		default:
			System.out.println("Verkeerde invoer");
		}
	}

}
