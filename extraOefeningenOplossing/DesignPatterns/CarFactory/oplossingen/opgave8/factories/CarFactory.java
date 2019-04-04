package factories;

import java.util.Random;

import garage.Cabriolet;
import garage.Car;
import garage.Color;
import garage.FamilyCar;
import garage.SportCar;

public class CarFactory {
	
	
	private static Random rand;

	private String name;

	public static Car buildCar(Manifacuturer choice) {
		return makeCar(choice);
	}

	private static Car makeCar(Manifacuturer choice) {
		Car factoryCar;
		switch (choice) {
		case TESLA:
			factoryCar = TeslaCarFactory.buildCar();
			break;
		case AUDI:
			factoryCar = AudiCarFactory.buildCar();
			factoryCar.setType(CarType.FAMILY);
			break;
		case PORSHE:
			factoryCar = PorsheCarFactory.buildCar();
			factoryCar.setType(CarType.SPORT);
			break;
		default:
			factoryCar = null;
		}
		return null;
	}

}
