package org.rastalion.chapter14_geneste_en_anonieme_klassen.demo2;

public class Car {

    //Start with only price as property
    int price;
    //initiate after you made the innerclasses.
    Engine engine;
    Interior interior;
    Exterior exterior;

    //Only this constructor empty add beginning.
    public Car() {
        engine = new Engine();
        interior = new Interior();
        exterior = new Exterior();
        this.price = interior.price + exterior.price;
    }


    public void move() {
    //To use some engine methods
        engine.start();
        engine.run();
        engine.stop();
    }

    //Generate after you finished all the other classes
    @Override
    public String toString () {
        return "Car{" +
                "price=" + price +
                ", engine=" + engine +
                ", interior=" + interior +
                ", exterior=" + exterior +
                '}';
    }

    //First inner class everything private except the methods
    private class Engine {

        //Declare some class properties
        private int hp;
        private int capacity;
        private int price;

        //Private constructor
        private Engine() {
            this(75,70, 4000);
        }

        //Second private constructor
        private Engine (int hp, int capacity, int price) {
            this.hp = hp;
            this.capacity = capacity;
            this.price = price;
        }

        //Run method only sysout
        public void run() {
            System.out.println("Engine is running.\n");
        }

        //Stop method only sysout
        public void stop() {
            System.out.println("Engine is stopping.\n");
        }

        //Start method only sysout
        public void start() {
            System.out.println("Starting the engine.\nVroom	 -			                   vroom...\n");
        }

        //GETTERS AND SETTERS NOT GENERATED
        public int getHp () {
            return hp;
        }

        public void setHp (int hp) {
            this.hp = hp;
        }


        public int getCapacity () {
            return capacity;
        }

        public void setCapacity (int capacity) {
            this.capacity = capacity;
        }

        @Override
        public String toString () {
            return "Engine[" +
                    "hp:" + hp +
                    ", capacity:" + capacity +
                    ", price:" + price +
                    ']';
        }
    }

    protected class Interior {
        //Only protected property price
        protected int price;

        //protected constructor
        protected Interior() {
            this(5000);
        }

        //second constructor also protected acces modifier
        protected Interior (int price) {
            this.price = price;
        }

        //Getters and setters when time

        @Override
        public String toString () {
            return "Price of the Interior: " + price;
        }
    }
    //Almost the same as Interior class except the acces moddifiers are //default
    class Exterior {
        int price;

        Exterior() {
            this(7000);
        }

        Exterior (int price) {
            this.price = price;
        }

        @Override
        public String toString () {
            return "Price of the Exterior: " + price;
        }
    }

    //In the same class main method
    public static void main (String[] args) {

        //Deze eerst maken
        Car nissan = new Car();

        //De twee manieren tonen eerst de bovenste
        Engine engine = new Car().new Engine();

        //Dan tonen aan de hand van de instantie nissan
        Engine engine1 = nissan.new Engine();

        //Tonen dat dit dus ook kan vragen of dit toebehoort aan 	//nissan
        Interior interior = nissan.new Interior();
        Exterior exterior = nissan.new Exterior();

        //Enkele setters gebruiken op engine instantie
        engine.setHp(88);
        engine.setCapacity(85);

        //Daarna alle instanties afprinten naar de console
        System.out.println(engine);
        System.out.println(engine1);

        System.out.println(nissan);
        System.out.println(interior);
        System.out.println(exterior);
    }
}
