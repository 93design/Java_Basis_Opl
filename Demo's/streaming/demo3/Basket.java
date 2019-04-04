package org.rastalion.chapter19_streaming_api.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mrrobot on 21/11/2017 streams demo.
 */
public class Basket {

    private List<Product> basket;
    private int totalPrice;
    private long basketID;
    private long counter;

    public Basket () {
        basket = new ArrayList<>();
        basketID = counter++;
    }

    public void addProduct (Product product) {
        totalPrice += product.getPrice();
        basket.add(product);
        sortAlphabetically();
    }

    public void deleteProduct (Product product) {
        basket.remove(product);
        totalPrice -= product.getPrice();
    }

    private void sortAlphabetically () {
        basket = basket.stream().sorted().collect(Collectors.toList());
    }

    public void updateQuantity (int quantity, Product p) {
        basket.get(basket.indexOf(p)).setQuantity(quantity);
    }

    public int getTotalPrice () {
        return totalPrice;
    }

    @Override
    public String toString () {
        return "Basket{" +
                "basket=" + basket +
                ", totalPrice=" + totalPrice +
                ", basketID=" + basketID +
                ", counter=" + counter +
                '}';
    }
}

