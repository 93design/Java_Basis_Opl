package app;

import Boat.BoatIsFullException;
import Boat.BoatOverloadedException;
import Boat.CarBoatWithFlags;
import factories.CarFactory;
import factories.CarType;
import factories.Manifacuturer;
import garage.Car;
import garage.Color;
public class CarBoatAppFactoryFlags {

	public static final double MAX_SPEED = 70;
	public static void main(String[] args) {

		CarBoatWithFlags highway_of_the_sea = new CarBoatWithFlags(1000, 1000000);

		// Vul de garage totdat die vol is en vang de exception op.
		// Zorg voor een gebruiksvriendelijke boodschap
		int randomAmount = (int) (900 + (Math.random() * 200));
		
		System.out.println("making" +  randomAmount + " randomCars");
		
		for (int i = 0; i < randomAmount; i++) {
			Car v = CarFactory.buildCar(Manifacuturer.AUDI);	
					try {
				highway_of_the_sea.addVehicle(v);
			} catch (BoatIsFullException | BoatOverloadedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		highway_of_the_sea.printBoat();
		System.out.println("boat shipmentWeight = " + highway_of_the_sea.getCarWeight() + " voor " + highway_of_the_sea.getCarCounter() + " auto's" );
	
	}
	
	private static double createRandomWeight() {
		return 900 + (Math.random() * 100);
	}

	private static double createRandomAcceleration(double maxSpeed) {
		return Math.random() * MAX_SPEED;
	}

	private static Color createRandomColor() {
		Color[] colors = Color.values();
		int index = (int) Math.round(Math.random() * colors.length - 1);
		index = index < 0 ? 0 : index;
		return colors[index];
	}

}
