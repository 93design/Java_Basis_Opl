package haven;

import garage.Car;

public class CarBoat extends Boat {

	private final int MAX_VEHICLE;
	private final int MAX_LOAD;
	private Car[] cars;
	private int carCounter = 0; 
	private double carWeight =0;
	
	public CarBoat(int maxV, int maxL) {
		super();
		MAX_VEHICLE = maxV;
		MAX_LOAD = maxL;
		cars = new Car[MAX_VEHICLE];
	}

	public void addVehicle(Car vehicle) {
		cars[carCounter] = vehicle;
		carCounter++;
		//exception for boat full
	
		
		//exception for boat overLoaded
		carWeight += vehicle.getWeight();
		if(carWeight > MAX_LOAD) {
			System.out.println("Overloaded");
		}
	}
	
	
	

	
}
