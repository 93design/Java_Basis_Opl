package org.rastalion.chapter20_collections.demo4;

import java.util.*;
import java.util.stream.Collectors;

public class HashSetApp {
    private static Scanner kbd = new Scanner(System.in);

    public static void main (String[] args) {

       /*
       First we make our HashSet
       and we give it the data type Set
       so that we can benefit from polymorphism
        */
        Set<String> texts = new HashSet<>();

       /*
       We can add some String values to our set
        */
        texts.add("Hello");
        texts.add("World");

        /*
       And easily print them using
       the foreach method using a lambda
        */
        texts.forEach(System.out::println);

       /*
       Black fucking magic
        */
        String sentence = "Where is my mind";

       /*
       Yes give me more power,
       you fool
        */
        Set<String> test = Arrays.stream(sentence.split(" "))
                .collect(Collectors.toSet());

       /*
       We can the use the addAll
       which takes a Collection as argument.
        */
        texts.addAll(test);

       /*
       Hold the press!!
        */
        int counter = 0;
        while (counter < 1E2){
            texts.addAll(test);
            counter++;
        }

       /*
       It works but how?
       It doesn't work but how?
        */
        texts.forEach(x -> System.out.println("Element is: " + x));

        /*
       Person Set
        */
        Set<Person> group = new HashSet<>();

        for (int i =0; i < 2; i++) {
            group.add(new Person(getInput("name"),
                    getInput("surname"),
                    Integer.valueOf(getInput("age")),
                    Integer.valueOf(getInput("weight")),
                    Integer.valueOf(getInput("length"))));
        }

        System.out.println("The size of group is now: "
                +group.size());

        Iterator<Person> it = group.iterator();

        do {
            System.out.println(it.next());
        }while (it.hasNext());

    }

    private static String getInput(String valueNeeded) {
        System.out.println("Please give the " + valueNeeded);
        return kbd.next();
    }

}
