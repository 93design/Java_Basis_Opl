package org.rastalion.chapter18_lambda_expressions.demo2;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import org.rastalion.chapter18_lambda_expressions.demo1.Text;
import org.rastalion.chapter18_lambda_expressions.demo1.WordFilter;

public class TextApp {
	public static void main(String[] args) {
		String a = "a";
		final String e = "e";
		Text text = new Text("Hello this is another example of a sentence containing words");

		System.out.println("**** Words containing 'e' ****");
		text.printFilteredWords((String s) -> s.contains(e));

		System.out.println("**** Long words ****");
		text.printFilteredWords((s) -> s.length() > 4);

		System.out.println("**** Words starting with 'a' ****");
		text.printFilteredWords(new WordFilter() {
			@Override
			public boolean isValid(String s) {
				return s.contains(a);
			}
		});

		System.out.println("**** Word with e second ****");
		text.printFilteredWords((s) -> checkSecondE(s));

		System.out.println("**** Word with 2e ****");
		text.printFilteredWords((s) -> checkDubbelE(s));

	}

	public static boolean checkSecondE(String in) {
		boolean test = false;
		for (String w : in.split(" ")) {
			if (w.length() > 1) {
				if (w.charAt(1) == 'e') {
					test = true;
				}
			}
		}
		return test;
	}

	public static boolean checkDubbelE(String in) {
		boolean test = false;
		int counter = 0;
		for (String w : in.split(" ")) {
			for (char c : w.toCharArray()) {
				if (c == 'e') {
					counter++;
				}
				if (counter > 1) {
					test = true;
				}
			}

		}
		return test;
	}
}
