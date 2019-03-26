package be.intecbrussel.gevorderden.generics.generics_01;

public class DuoApp {

    public static void main (String[] args) {

        /*
        Making some instances using diff types.
         */
        Duo<String> sd = new Duo<>("Hello", "World");
        Duo<Integer> id = new Duo<>(7, 5);
        Duo<Long> ld = new Duo<>(746987L, 546358L);
        Duo<Float> fd = new Duo<>(5.7F, 8.9F);

        /*
        We take the objects out our instances
        using the getters
         */
        System.out.println(sd.getFirst());
        System.out.println(sd.getSecond());

        System.out.println(id.getFirst());
        System.out.println(id.getSecond());

        System.out.println(ld.getFirst());
        System.out.println(ld.getSecond());

        System.out.println(fd.getFirst());
        System.out.println(fd.getSecond());

        //We swap the String duo
        sd.swap();

        //Then print them out
        System.out.println(sd.getFirst());
        System.out.println(sd.getSecond());

    }

}
