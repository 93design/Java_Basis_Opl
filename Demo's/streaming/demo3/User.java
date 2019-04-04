package org.rastalion.chapter19_streaming_api.demo3;

import java.util.Scanner;

public class User {

    private String userName;
    private String pwd;

    private Basket basket;
    private Scanner kbd = new Scanner(System.in);

    public User (String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
        this.basket = new Basket();
    }

    public void addToBasket (Product p) {
        basket.addProduct(p);
    }

    public void deleteFromBasket (Product p) {
        basket.deleteProduct(p);
    }

    public void changeQuantity (Product p, int quantity) {
        basket.updateQuantity(quantity, p);
    }

    public Product findProduct (String brand, String productName, Webshop shop) {

        Product temp = shop.findProductByBrandAndName(brand, productName)
                .stream().findAny().get();

        System.out.println("You want to add this to your basket? [yes-no]");
        if (kbd.next().equalsIgnoreCase("yes")) {
            addToBasket(temp);
        }
        return temp;
    }

    public void showBasket () {
        System.out.println(basket);
    }

}
