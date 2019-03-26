package be.intecbrussel.gevorderden.generics.generics_04;

public class GeneralPair<E> implements Pair<E> {

    private E left;
    private E right;


    public GeneralPair (E left, E right) {
        this.left = left;
        this.right = right;
    }

    public E getLeft () {
        return left;
    }

    public E getRight () {
        return right;
    }

    public void setLeft (E left) {
        this.left = left;
    }

    public void setRight (E right) {
        this.right = right;
    }

    @Override
    public String toString () {
        return "GeneralPair{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
