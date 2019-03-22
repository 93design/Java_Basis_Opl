package app;

import garage.Cabriolet;
import garage.Car;
import garage.Color;
import garage.FamilyCar;
import garage.GarageFullException;
import garage.Moveable;
import garage.SportCar;
import garage.VehicleAlreadyInGarageException;
import haven.BoatIsFullException;
import haven.BoatOverloadedException;
import haven.CarBoat;
public class CarBoatApp {

	public static final double MAX_SPEED = 70;
	public static void main(String[] args) {

		CarBoat highway_of_the_sea = new CarBoat(1000, 950000);

		// Vul de garage totdat die vol is en vang de exception op.
		// Zorg voor een gebruiksvriendelijke boodschap
		int randomAmount = (int) (900 + (Math.random() * 200));
		
		System.out.println("making" +  randomAmount + " randomCars");
		
		for (int i = 0; i < randomAmount; i++) {
			Color randomColor = createRandomColor();						
			double value = createRandomAcceleration(MAX_SPEED);
			double weight = createRandomWeight();			
			Car vehicle = new SportCar(randomColor);	
			
			vehicle.accelerate(value);			
			vehicle.setWeight(weight);
			try {
				highway_of_the_sea.addVehicle(vehicle);
			} catch (BoatIsFullException | BoatOverloadedException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

	private static double createRandomWeight() {
		return 900 + (Math.random() * 150);
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
