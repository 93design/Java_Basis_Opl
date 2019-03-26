package org.rastalion.chapter17_generieken.demo1;

public class SwapApp {

    public static void main(String[] args) {

        String sentence = "Hello World";
        Integer number = 7;

        Duo d = new Duo(sentence,number);

        //First
        System.out.println(d);

        //Second
        d.swap();
        System.out.println(d);

    }

}
