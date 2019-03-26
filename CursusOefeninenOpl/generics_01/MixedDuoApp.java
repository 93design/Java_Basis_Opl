package be.intecbrussel.gevorderden.generics.generics_01;

public class MixedDuoApp {

    public static void main (String[] args) {

        //make a mixed duo using String, Integer
        MixedDuo<String, Integer> md = new MixedDuo<>("Hello", 5);

        //We ask our objects out of the MixedDuo
        String s = md.getFirst();
        Integer i = md.getSecond();

        //We print them out
        System.out.println(s + " " + i);

    }
}
