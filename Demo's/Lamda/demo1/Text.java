package org.rastalion.chapter18_lambda_expressions.demo1;

public class Text {

    private String sentence;

    public Text(String sentence) {
        this.sentence = sentence;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String w: sentence.split(" ")) {
            if(filter.isValid(w)){
                System.out.println(w);
            }
        }
    }

    public void setSentence (String sentence) {
        this.sentence = sentence;
    }


}
