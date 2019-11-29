package ParkeerPlaatsApp;

import java.util.Arrays;



public class ParkeerPlaats {

	private String name;
	private Car[] cars = new Car[8];

	public ParkeerPlaats(String name) {
		this(new Car[8], name);
	}

	public ParkeerPlaats(Car[] cars, String name) {
		super();
		this.name = name;
		this.cars = cars;

	}

	public ParkeerPlaats() {
		this(new Car[8], "standaardParking");
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public void addAutos(Car autoIn) {
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] == null) {
				cars[i] = autoIn;
				break;
			} else {
				if (i == cars.length - 1) {
					System.out.println("parking vol");
				}
			}
		}

	}
	public void removeCar(int index) {
		cars[index] = null;
	}
	
	public void removeCar(Car car) {
		for (int i= 0; i < cars.length; i++) {
			if(cars[i].equals(car)) {
				cars[i] = null;
				break;
			} else {
				System.out.println("This car was not in this parkinPlace");				
			}
		}		
		//
	}

	public void printParkeerLayout() {
		int parkeerLength = 3;
		int count = 0;
		for (Car auto : cars) {
			if (auto != null) {
				System.out.print("| " + auto.toString() + "  |");
				count++;
				if (count % parkeerLength == 0) {
					System.out.print("\n");

				}
			} else {
				System.out.print("| " + " Empty (0000)" + "  |");
				count++;
				if (count % parkeerLength == 0) {
					System.out.print("\n");
				}			
			}
		}
	}

}
