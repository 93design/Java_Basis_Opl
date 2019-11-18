package be.intecBrussel.brasserieApp;

import java.util.Scanner;

public class BrasserieKlas {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("geef uw start uur");
		int startUur = input.nextInt();
		System.out.println("geef uw start minuten");
		int startMinuten = input.nextInt();

		System.out.println("geef uw stop uur");
		int stopUur = input.nextInt();
		System.out.println("geef uw stop minuten");
		int stopMinuten = input.nextInt();

		int totaalUur = 0;
		double totaalMinuten = 0;

		// eerst minuten berekening
		totaalMinuten = (60 - startMinuten) + stopMinuten;

		if (totaalMinuten >= 60) {
			totaalUur = totaalUur + 1;
			totaalMinuten = totaalMinuten - 60;
		}

		// als nacht over 24:00 gaan
		if (stopUur < startUur) {
			// eerste
			int urenDag1 = 24 - startUur;
			totaalUur = urenDag1 + stopUur;
		} else {
			totaalUur = stopUur - startUur;
		}

		if (startMinuten > stopMinuten) {
			totaalUur--;
		}

		System.out.println("totaalUur = " + totaalUur);
		System.out.println("totaalMinuten=" + totaalMinuten);

		final double LOON = 11.5;

		double geldMinuten = 0;
		double geldUren = 0;

		System.out.println("welke dag bent U begonnen? geef in met 1-7");
		int startDag = input.nextInt();

		switch (startDag) {
		case 1:
		case 2:
		case 3:
		case 4:
			geldMinuten = (totaalMinuten / 60) * LOON;
			geldUren = totaalUur * LOON;
			double betaling = geldMinuten + geldUren;
			System.out.println("Uw loon is = " + betaling);

			break;
		case 5:
			// TODO

		case 6:
		case 7:
		default:
		}
		if(startMinuten <30) System.out.println("minstens 30 minuten werken in een uur");
		input.close();

	
	}

}
