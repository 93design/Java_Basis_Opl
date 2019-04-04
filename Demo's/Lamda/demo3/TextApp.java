package org.rastalion.chapter18_lambda_expressions.demo3;

public class TextApp {
    public static void main (String[] args) {

        Text text= new Text("This is yet another example sentence containing words");

        System.out.println("\n**** Implementing the method isValid with lambda directly ****\n");
        //Lambda using text obj and calling method printProcessedWords
        text.printProcessedWords(s -> String.format("<<%s>>", s));  //implementing method

        //Nu eerst TextUtil interface maken

        System.out.println("\n**** Implementing the method isValid by using the TextUtil interface with quote method ****\n");

        text.printProcessedWords(s -> TextUtil.quote(s));
        //TextUtil using the quote method which
        //has the same method params and return type

        System.out.println("\n**** Implementing the method isValid by using the TextUtil interface with quote method with :: operaror ****\n");

        text.printProcessedWords(TextUtil::quote);
        //Using the interface only method quote
        //this changes the behavior of the
        //Wordfilter isValid method to same
        //as above method.

        //Nu eerst TextPadder maken


        //Second part
        TextPadder padder = new TextPadder(20);
        text.printProcessedWords(s -> padder.pad(s));
        text.printProcessedWords(padder::pad);
        text.printProcessedWords(padder::toUpper);

    }

}
