package Solution;

public enum FrySizes {
    SMALL("Small",1.5),
    MEDIUM("Medium",2.5),
    BIG("Big",3),
    FAMILY("Family",4.5);

    private String name;
    private double price;

    FrySizes(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


}
