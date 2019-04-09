package Solution;

public class Beer extends Drink {
    final double price = 2.5;


    public Beer() {

    }

    public Beer(String name) {
        super(name);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}
