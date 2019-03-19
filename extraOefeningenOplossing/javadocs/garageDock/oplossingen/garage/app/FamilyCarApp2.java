package app;

import garage.FamilyCar;
import garage.SportCar;
import garage.Car;
import garage.Color;

public class FamilyCarApp2 {

	public static void main(String[] args) {

		System.out.println("FamilyCar.count = " + FamilyCar.getCount());
		System.out.println("Car.count = " + Car.getCount());

		System.out.println("--------------------------------");
		System.out.println("    FamilyCar setters");
		System.out.println("--------------------------------");
		FamilyCar FamilyCarBlue = new FamilyCar();
		System.out.println("FamilyCar.color = " + FamilyCarBlue.getColor());
		System.out.println("FamilyCar.speed = " + FamilyCarBlue.getSpeed());

		FamilyCarBlue.setColor(Color.BLUE);
		System.out.println("FamilyCar.color = " + FamilyCarBlue.getColor());

		System.out.println("FamilyCar.count = " + FamilyCar.getCount());
		System.out.println("Car.count = " + Car.getCount());

		System.out.println("--------------------------------");
		System.out.println("    FamilyCar constructor");
		System.out.println("--------------------------------");
		FamilyCar FamilyCarGreen = new FamilyCar(Color.GREEN);
		System.out.println("FamilyCar.color = " + FamilyCarBlue.getColor());

		FamilyCar FamilyCarBlack = new FamilyCar(Color.BLACK);
		FamilyCar FamilyCarWhite = new FamilyCar(Color.WHITE);
		SportCar sportCar = new SportCar(Color.WHITE);

		System.out.println("FamilyCar hashCode");
		System.out.println("FamilyCar.hashCode = " + FamilyCarBlue.hashCode());

		System.out.println("--------------------------------");
		System.out.println("    FamilyCar toString");
		System.out.println("--------------------------------");
		System.out.println(FamilyCarBlue.toString());

		System.out.println("--------------------------------");
		System.out.println("    Garbage Colector");
		System.out.println("--------------------------------");
		System.out.println("Befor garbage collector FamilyCar.count = " + FamilyCar.getCount());
		System.out.println("Car.count = " + Car.getCount());
		FamilyCarBlue = null;
		FamilyCarBlack = null;
		sportCar = null;
		System.gc();
		for (double i = 0; i < 100000000; i++) {

		}
		System.out.println("After garbage collector FamilyCar.count = " + FamilyCar.getCount());
		System.out.println("After garbage collector sportCar.count = " + SportCar.getCount());
		System.out.println("Car.count = " + Car.getCount());

	}

}
