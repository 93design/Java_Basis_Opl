package org.rastalion.chapter19_streaming_api.demo3;

import java.util.List;
import java.util.stream.Collectors;

public class Webshop {
    private Stock stock;
    private List<Product> products;

    public Webshop () {
        stock = new Stock(25);
        products = stock.unloadTruck();
    }

    public List<Product> findProductByBrandAndName (String brand, String name) {
        products.stream().forEach(System.out::println);
        return products.stream()
                .filter(product -> {
                    return product.getBrand().equalsIgnoreCase(brand)
                            && product.getProductName().equalsIgnoreCase(name);
                })
                .collect(Collectors.toList());
    }

    @Override
    public String toString () {
        return "Webshop{" +
                "stock=" + stock +
                ", products=" + products +
                '}';
    }

}
