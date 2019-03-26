package be.intecbrussel.gevorderden.generics.generics_04;

public class Shoe {

    private String name;

    public Shoe(String name) {
        this.name = name;
    }

    @Override
    public String toString () {
        return name + '\'';
    }
}
