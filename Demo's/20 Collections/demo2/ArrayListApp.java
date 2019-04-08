package org.rastalion.chapter20_collections.demo2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ArrayListApp {
    public static void main (String[] args) {

        Random rand = new Random();

       /*
        We are making a new ArrayList that holds the Integer
        Data type. This is an unsorted list and implements
        the List interface.
        */
        List<Integer> numbers = new ArrayList<Integer>();

       /*
        Adding numbers to an ArrayList.
        this list is unsorted!
        */
        numbers.add(0, 10);
        numbers.add(1, -20);
        numbers.add(2, rand.nextInt(10));

       /*
        For loop so that you add the list with
        value of random number
        */
        for (int i = 0; i < 125; i++) {
            numbers.add(rand.nextInt(1_000_000));
        }

       /*
       You can get a element by using the get Method
       Which is inherited by the ArrayList from the List interface.
       */
        numbers.get(0);

        //you can also take the last element as such
        System.out.println("Last number in list: "
                + numbers.get(numbers.size() - 1) + "\n");

        //indexed iteration loop.
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("|\t" + i + "\t|\t" + numbers.get(i) + "\t|");
        }

        //Costly procedure!!
        numbers.remove(0);

        //Less costly...
        numbers.remove(numbers.size() - 1);

       /*
       It's time for a headache

       Aantonen dat er duplicaten mogelijk zijn in een ArrayList
        */
        System.out.println("\nHeadache incoming...");


        //Here you make instance of String
        //and you give it a sentence as value
        String sentence = "Where is my mind";

        //We convert the String to Array and then use the collect
        //method of Stream to make it a list.
        List<String> col = Arrays.stream(sentence.split(" "))
                .collect(Collectors.toList());

        //Here you use the method addAll which takes a collection
        //as argument.
        col.addAll(Arrays.stream(sentence.split( " "))
                .collect(Collectors.toList()));

        System.out.println("\n");

        //Just to show that the Collections have a foreach method.
        col.forEach(System.out::println);
        System.out.println("\n");

    }

}
