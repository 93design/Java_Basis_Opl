package Game;

import java.util.Random;
import java.util.Scanner;

public class Game {

	private final int MAX_ATTEMPS = 4;
	private Random rand = new Random();
	private int guess;
	private int noAttemps = 0;
	private int randomNumber = 0;
	Scanner key = new Scanner(System.in);

	public void Start() {
		randomNumber = rand.nextInt(50) + 1;
		boolean guessed = false;
		while (!guessed && noAttemps < MAX_ATTEMPS) {
			System.out.println("Maak uw gok");
			guessed = MakeAGuess(key.nextInt());
			noAttemps++;
		}
		if (noAttemps >= MAX_ATTEMPS) {
			Stop();
		}
	}

	private boolean MakeAGuess(int guess) {
		if (guess < randomNumber) {
			System.out.println("hoger");
			return false;
		} else if (guess > randomNumber) {
			System.out.println("lager");
			return false;
		} else {
			System.out.println("gewonnen");
			Stop();
			return true;
		}
	}

	public void Stop() {
		if (noAttemps < MAX_ATTEMPS) {
			System.out.println("game is gewonnen");
		} else {
			System.out.println("Kansen op");
		}

	}

}
