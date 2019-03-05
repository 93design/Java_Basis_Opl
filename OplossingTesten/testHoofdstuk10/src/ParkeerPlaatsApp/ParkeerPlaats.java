package ParkeerPlaatsApp;

import java.util.Arrays;

public class ParkeerPlaats {
	
	Auto[] cars = new Auto[0];

	public ParkeerPlaats(Auto[] cars) {
		super();
		this.cars = cars;
	}

	public ParkeerPlaats() {
		// TODO Auto-generated constructor stub
	}

	public Auto[] getCars() {
		return cars;
	}

	public void setCars(Auto[] cars) {
		this.cars = cars;
	}
	
	
	public void addAutos(Auto autoIn) {
		cars = Arrays.copyOf(cars, cars.length + 1);
		cars[cars.length-1] = autoIn;
	}
	
	
	public void printParkeerLayout() {
		int parkeerLength = 3;
		int count = 0;
		for (Auto auto: cars) {
			
			System.out.println("| " + auto.toString() + "  |")  ;
			if (count == parkeerLength) {
				System.out.println("\n");
				count = 0;
			}
			
		}
	}
	

}
