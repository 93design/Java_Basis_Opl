package org.rastalion.chapter17_generieken.demo2;

public class DuoApp {

    public static void main(String[] args) {

        Duo<String> sd = new Duo<String>("Hello", "World");
        Duo<Integer> id = new Duo<>(42, 59);

        System.out.println("Before swap");
        System.out.println("First element: " + sd.getFirst());
        System.out.println("Second element: " + sd.getSecond() + '\n');

        sd.swap();

        System.out.println("After swap");
        System.out.println("First element: " + sd.getFirst());
        System.out.println("Second element: " + sd.getSecond()+ '\n');

        System.out.println("Before swap");
        System.out.println("First element: " + id.getFirst());
        System.out.println("Second element: " + id.getSecond()+ '\n');

        id.swap();

        System.out.println("After swap");
        System.out.println("First element: " + id.getFirst());
        System.out.println("Second element: " + id.getSecond());
    }

}
