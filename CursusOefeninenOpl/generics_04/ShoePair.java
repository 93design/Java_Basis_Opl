package be.intecbrussel.gevorderden.generics.generics_04;

public class ShoePair implements Pair<Shoe> {

    private Shoe leftShoe;
    private Shoe rightShoe;

    public ShoePair (Shoe left, Shoe right) {
        leftShoe = left;
        rightShoe = right;
    }

    /*
    Overwritten methods of interface Pair
     */
    public Shoe getLeft () {
        return leftShoe;
    }

    public Shoe getRight () {
        return rightShoe;
    }

    public void setLeft (Shoe left) {
        leftShoe = left;
    }

    public void setRight (Shoe right) {
        rightShoe = right;
    }

    @Override
    public String toString () {
        return "ShoePair{" +
                "leftShoe=" + leftShoe +
                ", rightShoe=" + rightShoe +
                '}';
    }
}
