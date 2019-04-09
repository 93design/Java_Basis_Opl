package Solution;

public class Sauce implements Orderable {


    private final double price = 0.8;
    private String name;


    //constructor
    public Sauce() {

    }

    public Sauce(String name) {
        this.name = name;
    }

    //setters en getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //implement method
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name ;
    }
}
