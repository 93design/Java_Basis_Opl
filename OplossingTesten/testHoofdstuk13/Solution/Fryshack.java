package Solution;

public class Fryshack {

    private String name;

    //constructor
    public Fryshack(String string) {
        this.name = string;
    }

    public String getName() {
        return name;
    }

    public void makeOrders() {
        makeOrderOne();
        makeOrderTwo();
        makeOrderTree();
        makeOrderFour();
    }

    // make an order by making Fries, Sauce and Drink Objects and setting them with
    // there Setters
    private void makeOrderOne() {
        Fries grootPak = new Fries();
        grootPak.setPortionCount(1);
        grootPak.setSize(FrySizes.BIG);

        Fries mediumPak = new Fries();
        mediumPak.setSize(FrySizes.MEDIUM);
        mediumPak.setPortionCount(1);

        Sauce mayonaise = new Sauce();
        mayonaise.setName("Mayonaise");
        Sauce ketchup = new Sauce();
        ketchup.setName("Ketchup");
        Water water = new Water();
        water.setName("Water");
        Soda soda = new Soda();
        soda.setName("Cola");

        Order order1 = new Order();
        order1.addToOrder(grootPak);
        order1.addToOrder(mediumPak);
        order1.addToOrder(mayonaise);
        order1.addToOrder(ketchup);
        order1.addToOrder(water);
        order1.addToOrder(soda);


        System.out.println("-------------------- ORDER1-----------------------");
        System.out.println(order1);
        order1.fryOrder(grootPak);
        order1.fryOrder(mediumPak);

        System.out.println("Het zal " + order1.CalculateTotalPrice() + " euro kosten");
    }

    // make an order by making new Fries, Sauce and Drink Objects and setting them
    // with there Constructors
    private void makeOrderTwo() {
        Fries family = new Fries(FrySizes.FAMILY, 1);
        Sauce mayonaise = new Sauce("Mayonaise");
        Sauce mayonaise2 = new Sauce("Mayonaise");
        Sauce ketchup = new Sauce("Ketchup");
        Water water = new Water("Water");
        Soda soda1 = new Soda("Cola");
        Soda soda2 = new Soda("Sprite");
        Soda soda3 = new Soda("Fanta");

        Order order2 = new Order();
        order2.addToOrder(family);
        order2.addToOrder(mayonaise);
        order2.addToOrder(mayonaise2);
        order2.addToOrder(ketchup);
        order2.addToOrder(water);
        order2.addToOrder(soda1);
        order2.addToOrder(soda2);
        order2.addToOrder(soda3);

        System.out.println("-------------------- ORDER2-----------------------");
        System.out.println(order2);
        order2.fryOrder(family);

        System.out.println("Het zal " + order2.CalculateTotalPrice() + " euro kosten");
    }

    // make an onlineOrder with a Orderable array
    private void makeOrderTree() {

        Order order3 = new Order();
        Fries big = new Fries(FrySizes.BIG, 2);
        Fries small = new Fries(FrySizes.SMALL, 1);
        Sauce ketchup = new Sauce("Ketchup");
        Water water = new Water("Water");
        Soda soda1 = new Soda("Cola");
        Beer beer = new Beer("Stella");
        
        order3.addToOrder(big);
        order3.addToOrder(small);
        order3.addToOrder(ketchup);
        order3.addToOrder(water);
        order3.addToOrder(soda1);
        order3.addToOrder(beer);

        System.out.println("-------------------- ORDER3-----------------------");
        System.out.println(order3);
        order3.fryOrder(big);
        order3.fryOrder(small);


        System.out.println("Het zal " + order3.CalculateTotalPrice() + " euro kosten");

    }

    ;

    // make an your own Order
    private void makeOrderFour() {
        Fries small = new Fries(FrySizes.SMALL, 3);
        Sauce mayonaise = new Sauce("Mayonaise");
        Sauce ketchup = new Sauce("Ketchup");
        Water water = new Water("Water");
        Soda soda1 = new Soda("Cola");
        Beer beer = new Beer("Jupiler");

        Order order4 = new Order();
        order4.addToOrder(small);
        order4.addToOrder(mayonaise);
        order4.addToOrder(ketchup);
        order4.addToOrder(water);
        order4.addToOrder(soda1);
        order4.addToOrder(beer);


        System.out.println("-------------------- ORDER4-----------------------");
        System.out.println(order4);
        order4.fryOrder(small);

        System.out.println("Het zal " + order4.CalculateTotalPrice() + " euro kosten");


    }


}