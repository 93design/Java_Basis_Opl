package org.rastalion.chapter18_lambda_expressions.demo3;

public class Text {

    //String that we need to manipulate data
    private String sentence;

    //Contructor with param String sentence
    public Text (String sentence) {
        this.sentence = sentence;
    }

    //Method to manipulate our sentence
    public void printProcessedWords(WordProcessor processor) {
        for (String w: sentence.split(" ")) {
            System.out.println(processor.process(w));
        }
    }

    //settter for our sentence
    public void setSentence (String sentence) {
        this.sentence = sentence;
    }

}
