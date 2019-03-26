package be.intecbrussel.gevorderden.generics.generics_04;

public class ShoePairApp {

    public static void main (String[] args) {

        Shoe leftShoe = new Shoe("Left");
        Shoe rightShoe = new Shoe("Right");
        Pair<Shoe> pair = new ShoePair(leftShoe, rightShoe);
        pair.swap();

        System.out.println(pair);

    }

}
