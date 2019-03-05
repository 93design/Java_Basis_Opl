package be.bartcoding.arrays;

import java.io.IOException;

public class DictionaryApp {

	public static void main(String[] args) throws IOException {

		char[][] dictionary = generateDictionary(5);
		
		System.out.println(dictionary.length);
		System.in.read();
		System.out.println(dictionary[dictionary.length - 1]);
	}

	private static char[][] generateDictionary(int amountOfLetters) {
		char[][] dictionary = new char[(int) Math.pow(26, amountOfLetters)][amountOfLetters];
		char[] word = new char[amountOfLetters];
		for (int i = 0; i < word.length; i++) {
			word[i] = 'a';
		}
		dictionary[0] = word;

		for (int i = 1; i < dictionary.length; i++) {
			dictionary[i] = nextWord(dictionary[i - 1]);
		}
		return dictionary;
	}

	private static char[] nextWord(char[] word) {
		char[] nextWord = word.clone();
		int counter = nextWord.length - 1;
		while (counter > -1) {
			if (nextWord[counter] < 'z') {
				nextWord[counter]++;

				return nextWord;
			} else {
				nextWord[counter] = 'a';
			}
			counter--;

		}
		return nextWord;
	}

}
