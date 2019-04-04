package org.rastalion.chapter18_lambda_expressions.demo3;

public class TextPadder {
    private int size;

    public TextPadder(int size) {
        this.size = size;
    }

    //Method to give our Strings some padding
    public String pad(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size - s.length(); i++) {
            sb.append(' ');
        }
        sb.append(s);
        return sb.toString();
    }

    //Method that convert our strings to uppercase
    public String toUpper(String s) {
        String upper = s.toUpperCase();
        return upper;
    }

}
