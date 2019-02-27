package carEnum;

import PersonEnum.Person;

public class Car {
	private int horsePower;
	private BrandType brand;
	private Person owner;
	private FuelType fuel;
	private double fuelUsage;
	private double maxFuel;
	
	
	public Car(BrandType brand, FuelType fuel) {
		super();
		this.brand = brand;
		this.fuel = fuel;
	}
	
	
}
