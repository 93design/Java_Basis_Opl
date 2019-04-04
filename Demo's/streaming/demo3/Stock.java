package org.rastalion.chapter19_streaming_api.demo3;

import java.util.ArrayList;
import java.util.List;

public class Stock {

    private List<Product> products;

    public Stock (int quantity) {
        products = new ArrayList<>();
        factoryMethod(quantity);
    }

    private void factoryMethod (int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(new Product("5T", "OnePlus",
                    Product.ProductType.ELECTRONIC, 499));
        }
    }

    public List unloadTruck () {
        return products;
    }

    @Override
    public String toString () {
        return "Stock{" +
                "products=" + products +
                '}';
    }

}
