package app;


import garage.Cabriolet;
import garage.Car;
import garage.Color;

public class CabrioletCarApp {

	public static void main(String[] args) {

	
		System.out.println("--------------------------------");
		System.out.println("    Cabriolet constructor");
		System.out.println("--------------------------------");
		Cabriolet cabrioletGreen = new Cabriolet(Color.GREEN, true);
		Cabriolet cabrioletBlue= new Cabriolet(Color.BLUE, true);
		Cabriolet cabrioletBlack = new Cabriolet(Color.BLACK, true);
		Cabriolet cabrioletRed = new Cabriolet(Color.RED, true);
		Cabriolet cabrioletWhite = new Cabriolet(Color.WHITE, true);
		Cabriolet cabrioletYellow = new Cabriolet(Color.YELLOW, true);
		System.out.println("--------------------------------");
		System.out.println("    Garbage Colector");
		System.out.println("--------------------------------");
		System.out.println("Befor garbage collector Cabriolet.count = " + Cabriolet.getCount());
		System.out.println("Car.count = " + Car.getCount());
		cabrioletBlue = null;
		cabrioletBlack = null;
		cabrioletRed = null;
		System.gc();		
	
		//give it some time
		for(double i = 0; i <10000000; i++) {
			
		}
		System.out.println("After garbage collector Cabriolet.count = " + Cabriolet.getCount());
		System.out.println("Car.count = " + Car.getCount());
		
		
	}

}
