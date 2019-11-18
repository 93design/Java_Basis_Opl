package be.intecBrussel.brasserieApp;

import java.util.Scanner;

public class BrasserieApp {

	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		System.out.println("enter your startUur");
		int startUur = in.nextInt();

		System.out.println("enter your startMinuten");
		int startMinuten = in.nextInt();

		System.out.println("enter your stopUur");
		int stopUur = in.nextInt();

		System.out.println("enter your stopMinuten");
		int stopMinuten = in.nextInt();

		// calculate uren
		int totaalMinuten = 0;
		int totaalUur = 0;
		// over middernacht gewerkt
		if (startUur > stopUur) {
			if (startMinuten < stopMinuten) {
				totaalMinuten = (60 - startMinuten) + stopMinuten;
			} 
			totaalUur = (24 - startUur) + stopUur;
		} else {
			totaalUur = stopUur - startUur;
			if (stopMinuten < startMinuten) {
				totaalMinuten = (60 - startMinuten) + stopMinuten;
				totaalUur -= 1;
				if (totaalMinuten >= 60) {
					totaalUur -= 1;
					totaalMinuten -= 60;
				}
			} else {
				totaalMinuten = (60 - startMinuten) + stopMinuten;
				if (totaalMinuten >= 60) {
					totaalMinuten -= 60;
				}
			}
		}

		System.out.println("totaalUur: " + totaalUur);
		System.out.println("totaalMinute: " + totaalMinuten);

	}
}
