package Boat;

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

	public void addVehicle(Car vehicle) throws  BoatIsFullException, BoatOverloadedException {
		
		if (carCounter >= MAX_VEHICLE) {
			throw new BoatIsFullException("the boat is already full off cars");
		} else { 
			cars[carCounter] = vehicle;
			carCounter++;		
			double testWeight = carWeight;
			if ((testWeight += vehicle.getWeight()) > MAX_LOAD) {
				throw new BoatOverloadedException("Boat is gonna be overloaded");
			} else {
				carWeight = testWeight;
			}
	
		} 
		
		
	}
	
	
	

	
}
