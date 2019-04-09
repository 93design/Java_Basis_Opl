package Solution;

public class Soda extends Drink {
    final double price = 2;

    public Soda() {

    }

    public Soda(String name) {
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
