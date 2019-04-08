package org.rastalion.chapter20_collections.demo1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorApp {

    public static void main (String[] args) {

        /*
       we maken een instantie aan van een arrayList.
       Als dataType geven we Collection aan.
       We kunnen nog steeds alle methodes gebruiken van ArrayList?
        */
        Collection<String> list = new ArrayList<>(10);

       /*
       Hier gaan we enkele String values meegeven.
        */
        list.add("Hello");
        list.add("World");
        list.add("where");
        list.add("is");
        list.add("my");
        list.add("mind");

       /*
       We gaan kijken naar de size van onze List.
        */
        System.out.println("The size of our list is: " + list.size());

       /*
       We kunnen dankzij het feit dat alle collections
       de ook te interface Iterable implementeren
       gebruiken maken van een interne iterator.
        */
        Iterator<String> iterator = list.iterator();

        /*
       Zolang er nog elementen aanwezig zijn in de lijst
       kunnen we deze oproepen dankzij de next methode.
        */
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

       /*
       Ook de forEach methode kan gebruikt worden
       om te itereren. We gebruiken hier een lambda
       die dient als Consumer.
        */
        list.forEach(x -> System.out.println(x));

       /*
       Of nog beter
        */
//        list.forEach(System.out::println);

       /*
       Indien we willen weten of een list leeg is kunnen
       we gebruik maken van onderstaande methode.
        */
        System.out.println("List is empty: "+list.isEmpty());

       /*
       We can see if an object is present in our
       List.
        */
        System.out.println("String mind is present: "
                + list.contains("mind"));

       /*
       We kunnen de list als volgt leegmaken
        */
        list.clear();
        System.out.println("List is being cleared...");

        System.out.println("List is empty: "+list.isEmpty());

    }

}
