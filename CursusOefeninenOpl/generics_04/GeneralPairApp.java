package be.intecbrussel.gevorderden.generics.generics_04;

public class GeneralPairApp {

    public static void main (String[] args) {

        Shoe leftShoe = new Shoe("Left");
        Shoe rightShoe = new Shoe("Right");
        GeneralPair<Shoe> pair = new GeneralPair<>(leftShoe, rightShoe);
        pair.swap();

        System.out.println(pair);

    }

}
