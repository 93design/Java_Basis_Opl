package Solution;

public class Water extends Drink {
    final double price = 1.5;


    public Water() {

    }

    public Water(String name) {
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
