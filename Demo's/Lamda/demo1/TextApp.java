package org.rastalion.chapter18_lambda_expressions.demo1;

public class TextApp {
    public static void main (String[] args) {

        Text text = new Text("Hello this is an example of a sentence containing words");

        System.out.println("**** Words containing 'e' ****");
        text.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid (String s) {
                return s.contains("e");
            }
        });

        System.out.println("**** Long words ****");
        text.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid (String s) {
                return s.length() > 4;
            }
        });

        System.out.println("**** Words starting with 'a' ****");
        text.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid (String s) {
                return s.startsWith("a");
            }
        });
    }

}
