package org.rastalion.chapter19_streaming_api.demo3;

public class App {

    public static void main (String[] args) {

        //Make a webshop and user
        Webshop shop = new Webshop();
        User alex = new User("Mr Robot", "1234");

        //Use the findProduct method of the User instance
        Product product = alex.findProduct("Oneplus", "5T", shop);
                alex.showBasket();
        shop.findProductByBrandAndName("Oneplus", "5T");
        alex.deleteFromBasket(product);
        alex.showBasket();
//        alex.addToBasket(product);
//        alex.showBasket();
    }

}
