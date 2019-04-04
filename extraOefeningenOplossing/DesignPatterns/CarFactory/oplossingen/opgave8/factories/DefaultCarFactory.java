package factories;

import java.util.Random;

import garage.Cabriolet;
import garage.Car;
import garage.Color;
import garage.FamilyCar;
import garage.SportCar;

public abstract class DefaultCarFactory {
	
	private static Random rand;
		
	private String name;
	
	public static Car buildCar(CarType choice) {		
		return makeCar(choice);
	}
	
	private static Car makeCar(CarType choice) {
		Car factoryCar;
		switch(choice) {
		 case CABRIO:  factoryCar = new Cabriolet(); factoryCar.setType(CarType.CABRIO); break;
		 case FAMILY:  factoryCar = new FamilyCar(); factoryCar.setType(CarType.FAMILY);break;
		 case SPORT: factoryCar = new SportCar(); factoryCar.setType(CarType.SPORT);break;
		 default: factoryCar = null;
		}
		factoryCar.accelerate(0);
		factoryCar.setColor(randColor());
		factoryCar.setWeight((int) rand.nextDouble()*1200);
		
		return factoryCar;
	}
	
	private static Color randColor() {
		return Color.values()[rand.nextInt(Color.values().length)];
	}


}
