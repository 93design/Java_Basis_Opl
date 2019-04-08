package org.rastalion.chapter20_collections.demo5;

import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main (String[] args) {

        //We gaan hier een LinkedList maken,
        //En definieren deze als een Queue
        //Dit kan dankzij polymorphism!!
        Queue<String> queue = new LinkedList<>();

        //add a Person to the Queue
        //verzameling.
        queue.offer("Ted");
        queue.offer("BuuBuu");
        queue.offer("Elliot");
        queue.offer("Cece");
        queue.offer("Alex");

        //gaat kijken naar het element
        //uit de verzameling maar gaat deze
        //er niet uithalen.
        String s = queue.peek();

        while (s != null) {
            //we gonna take the first element and
            //remove this from the Queue
            System.out.println("About to handle: " + s);
            s = queue.poll();
            System.out.println("Handling: " + s);
            s = queue.peek();
        }

    }

}
