package be.intecBrussel.brasserieApp;

import java.util.Scanner;

public class TijdsMetingMetMinuten {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("geef uw start uur in");
		double startUur = keyboard.nextDouble();
		System.out.println("geef uw start minuten in");
		double startMinuten = keyboard.nextDouble();
	
		System.out.println("geef uw stop uur in");
		double stopUur = keyboard.nextDouble();
		System.out.println("geef uw stop minuten in");
		double stopMinuten = keyboard.nextDouble();
		
		final int DAGMINUTEN = 24*60;	
		
		
		//omzetten naar minuten
		double temp1 = (startUur*60) + startMinuten;
		double temp2 = (stopUur*60) + stopMinuten;
		
		if (temp1 < temp2) {
			System.out.println(temp2-temp1);
			System.out.println((temp2-temp1)/60);
		} else {
			temp1 = DAGMINUTEN - temp1;
			System.out.println(temp1 + temp2);
			System.out.println();
		}
		
		//close Scanner
		keyboard.close();
		
		
		
	}
}
