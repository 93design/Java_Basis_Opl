package Solution;

public class Fries implements Orderable, Fryable {
    FrySizes size;
    double price;
    int portionCount;


    //constructors


    public Fries() {
    }


    public Fries(FrySizes size, int portionCount) {
        this.size = size;
        this.price = size.getPrice();
        this.portionCount = portionCount;
    }

    public FrySizes getSize() {
        return size;
    }

    public void setSize(FrySizes size) {
        this.size = size;
        this.price = size.getPrice();

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPortionCount() {
        return portionCount;
    }

    public void setPortionCount(int portionCount) {
        this.portionCount = portionCount;
    }


    //methods
    public double calculatePrice() {
        double totaalprijs = price * portionCount;
        return totaalprijs;
    }

    //implement Methods
    @Override
    public double getPrice() {
        return calculatePrice();
    }

    @Override
    public void Fry() {
        System.out.println("Smijt een " + size.getName() + " portie in de frietpot");
    }

    @Override
    public String toString() {
        return size.getName();
    }
}
