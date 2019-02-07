package be.intecbrussel.test_basis;

import java.util.Scanner;

public class SchrikkelJaar {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("geef schrikkelJaar");
		int jaarIn = input.nextInt();

		boolean schrikkel = false;

		if (jaarIn % 4 == 0) {
			schrikkel = true;
			if (jaarIn % 100 == 0) {
				schrikkel = false;
				if (jaarIn % 400 == 0) {
					schrikkel = true;
				}
			}
		}

		System.out.println("schrikkel waar:" + schrikkel);

	}

}
