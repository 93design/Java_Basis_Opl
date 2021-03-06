package Boat;

import garage.Car;

public class CarBoatWithFlagsMethods extends Boat {

	private final int MAX_VEHICLE;
	private final int MAX_LOAD;
	private Car[] cars;
	private int carCounter = 0;
	private double carWeight = 0;
	boolean boatFull = false;

	public CarBoatWithFlagsMethods(int maxV, int maxL) {
		super();
		MAX_VEHICLE = maxV;
		MAX_LOAD = maxL;
		cars = new Car[MAX_VEHICLE];
	}

	public void addVehicle(Car vehicle) throws BoatIsFullException, BoatOverloadedException {
		if (!boatFull) {
			if (checkCount() && checkWeight(vehicle)) {
				cars[carCounter] = vehicle;
				carCounter++;		
			}				
		}
	}

	private boolean checkWeight(Car c) throws BoatOverloadedException {
		double testWeight = carWeight;
		if ((testWeight += c.getWeight()) > MAX_LOAD) {
			boatFull = true;
			throw new BoatOverloadedException("boat is gonna be overloade");
		} else {			
				carWeight = testWeight;

		}
		return boatFull;
	}


	
	private boolean checkCount() throws BoatIsFullException {
		if (carCounter >= MAX_VEHICLE) {
			boatFull = true;
			throw new BoatIsFullException("the boat is already full off cars");
		}
		return boatFull;
	}

	
	public void printBoat() {
		int count = 0;
		for (int i =cars.length-20; i <cars.length; i++) {
			 System.out.printf("|%30s | ",cars[i]);
			 System.out.print("  ");
			 count++;
			 if(count%4 ==0) {
				 System.out.println("");
			 }
		}
		
	}

	public int getCarCounter() {
		return carCounter;
	}


	public double getCarWeight() {
		return carWeight;
	}
	
	

	
	
	

}
