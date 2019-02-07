package be.intecbrussel.test_basis;

import java.util.Scanner;

public class DayHourMinutes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int minutenIn = input.nextInt();
		int days = 0;
		int hours = 0;
		int minuten = 0;
		while (minutenIn > 0) {
			if (minutenIn % (24 * 60) == 0) {
				days++;
				minutenIn -= (24 * 60);
			} else if (minutenIn % 60 == 0) {
				hours++;
				minutenIn -= 60;
			} else {
				minuten++;
				minutenIn--;
			}
		}

		System.out.println("dagen: " + days);
		System.out.println("uren: " + hours);
		System.out.println("minuten" + minuten);

	}

}
