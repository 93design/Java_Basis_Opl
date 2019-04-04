package org.rastalion.chapter19_streaming_api.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    private static List<Integer> profitPercentage = new ArrayList<>();

    public static void main (String[] args) {

        //I want to make a stream of some numbers
        //and sort them, then printing them to the console.
        Stream.of(4, 1, 3, 2, 5)
                //.filter(value -> value >= 3)
                //.sorted()
                .forEach(value -> System.out.println(value));

        //We have 2 Integer arrays holding some profit margin.
        Integer[] profitQ1 = {1, 2, 3, 4, 5, 6};
        Integer[] profitQ2 = {3, 4, 5, 6, 7, 8};

        //We are converting the arrays to streams.
        Stream<Integer> stream1 = Arrays.stream(profitQ1);
        Stream<Integer> stream2 = Arrays.stream(profitQ2);

        //and iterate over each stream while consuming
        //the element, we envoke an action
       // stream1.forEach(App::getMeSomeData);
       // stream2.forEach(App::getMeSomeData);

        //now we have the values of our arrays stored in a list
        //and we gonna print them by making them a stream and
        //iterating over it while calling a sysout on the element.
        profitPercentage.stream().forEach(System.out::println);


        //We make a "Random stream of ints".
        IntStream stream = IntStream.rangeClosed(-145, 325);

        //Then get a overview of their statistics
        System.out.println(stream.summaryStatistics());



       /*
       Say you are on a good webshop and you wanna order
       some products. While going through your shopping spree
       you open some products in a newtab and now you have
       multiple instances of your shopping cart
        */

        //Eerste tabblad waar de webshop openstaat
        IntStream tab1 = IntStream.rangeClosed(0, 10);

        //Tweede tabblad waar de webshop openstaat
        IntStream tab2 = IntStream.rangeClosed(0, 15);

        //Achtergrond service die beide mandjes combineert
        IntStream.concat(tab1, tab2)
                .distinct()
                .forEach(System.out::println);
    }

    private static void getMeSomeData (Integer i) {
        profitPercentage.add(i);
    }

}
