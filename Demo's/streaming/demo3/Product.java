package org.rastalion.chapter19_streaming_api.demo3;

public class Product {

    private String productName;
    private String brand;
    private long serialCode;
    private int quantity;
    private ProductType type;
    private int price;

    private static int counter;

    public int getPrice () {
        return price;
    }

    public enum ProductType {
        ELECTRONIC,
        FOOD,
        GARDEN,
        BOOK
    }

    public Product (String productName, String brand, ProductType type, int price) {
        createProduct(productName, brand, type, price);
    }

    private void createProduct (String productName, String brand,
                                ProductType type, int price) {
        this.productName = productName;
        this.brand = brand;
        this.serialCode = counter++;
        this.type = type;
        this.price = price;
        this.quantity = 1;
    }

    public String getProductName () {
        return productName;
    }

    public void setProductName (String productName) {
        this.productName = productName;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }

    public long getSerialCode () {
        return serialCode;
    }

    public void setSerialCode (long serialCode) {
        this.serialCode = serialCode;
    }

    public void setQuantity (int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals (Object o) {
        //generate
        return false;
    }

    @Override
    public int hashCode () {
        //generate
        return 0;
    }

    @Override
    public String toString () {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", brand='" + brand + '\'' +
                ", serialCode=" + serialCode +
                ", quantity=" + quantity +
                ", type=" + type +
                '}';
    }

}
