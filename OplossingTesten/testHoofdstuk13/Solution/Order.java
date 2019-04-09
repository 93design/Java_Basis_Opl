package Solution;

import java.util.Arrays;


public class Order {

    private Orderable[] order = new Orderable[0];
    private int orderCount;


    public Order() {

    }

    public Order(Orderable[] order, int orderCount) {
        this.order = order;
        this.orderCount = orderCount;

    }

    public double CalculateTotalPrice() {

        double totaalPrijs = 0;
        for (Orderable i :order) {
            totaalPrijs += i.getPrice();
        }

        return totaalPrijs;
    }

    //Put everything in fryer
    public void fryOrder(Orderable input) {
        if (input instanceof Fries) {
            System.out.println(input + " pak word in de fituur gebakken.");
        }

    }

    public void addToOrder(Orderable input) {
        Orderable[] temp = new Orderable[order.length + 1];
        for (int i = 0; i < order.length; i++) {
            temp[i] = order[i];
        }
        temp[order.length] = input;
        order = temp;


    }

    public Orderable[] getOrder() {
        return order;
    }

    public void setOrder(Orderable[] order) {
        this.order = order;
    }

    public static int getOrderNumber() {

        return 0;
    }

    @Override
    public String toString() {
        return "order = " + Arrays.toString(order);
    }
}
