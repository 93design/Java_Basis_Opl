package Oplossing;

import java.util.Random;
import java.util.Scanner;

public class BladSteenSchaarApp {
	public static void main(String[] args) {
		Random randGen = new Random();
		Scanner input = new Scanner(System.in);
		int scoreSpeler = 0;
		int scoreComputer = 0;
		System.out.println("Welkom bij het Spelletje Blad Steen Schaar");

		System.out.println("Maak uw keuze ");
		System.out.println("    1:blad");
		System.out.println("    2:steen");
		System.out.println("    3:schaar");

		boolean gedaan = false;

		while (!gedaan) {

			System.out.print("3..2..1 Keuze:");
			int spelerInput = input.nextInt();
			int computerInput = randGen.nextInt(3) + 1;

			if (spelerInput != computerInput) {
				if (spelerInput == 1) {
					if (computerInput == 2) {
						System.out.println("Speler Wint met blad tegen steen");
						scoreSpeler++;
					} else if (computerInput == 3) {
						System.out.println("Computer Wint met schaar tegen steen");
						scoreComputer++;
					}
				}
				if (spelerInput == 2) {
					if (computerInput == 1) {
						System.out.println("Computer Wint met blad tegen steen");
						scoreComputer++;

					} else if (computerInput == 3) {
						System.out.println("Speler Wint met steen tegen schaar");
						scoreSpeler++;
					}
				}
				if (spelerInput == 3) {
					if (computerInput == 1) {
						System.out.println("Speler Wint met schaar tegen blad");
						scoreSpeler++;
					} else if (computerInput == 2) {
						System.out.println("Computer wint met steen tegen schaar");
						scoreComputer++;
					}
				}

			} else {
				System.out.println("zelde resultaat");
			}

			System.out.println("Tussenstand speler:" + scoreSpeler + " computer:" + scoreComputer);
			System.out.println("==============");

			if (scoreSpeler >= 3 || scoreComputer >= 3) {
				if (scoreSpeler >= 3) {
					System.out.println("Speler gewonnen");

				} else {
					System.out.println("Computer gewonnen");
				}
				gedaan = true;

			}
		}
	}

}
