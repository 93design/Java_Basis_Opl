package factories;

import java.util.Random;

import garage.Cabriolet;
import garage.Car;
import garage.Color;
import garage.FamilyCar;
import garage.SportCar;

public abstract class PorsheCarFactory {
	
	private static Random rand;

	private String name;

	public static Car buildCar() {
		return makeCar(randType());
	}

	private static Car makeCar(CarType choice) {
		Car factoryCar;
		switch(choice) {
		 case CABRIO:  
			 	factoryCar = new Cabriolet();
			 	factoryCar.setType(CarType.CABRIO); 
			 	factoryCar.setModelName("911"); 
			 	break;
		 case FAMILY: 
			 	factoryCar = new FamilyCar(); 
			 	factoryCar.setType(CarType.FAMILY);
			 	factoryCar.setModelName("Panamera"); 
			 	break;
		 case SPORT: 
			 	factoryCar = new SportCar(); 
			 	factoryCar.setType(CarType.SPORT);
			 	factoryCar.setModelName("911 Turbo"); 
			 	break;
		 default: factoryCar = null;
		}
		factoryCar.accelerate(0);
		factoryCar.setColor(randColor());
		factoryCar.setWeight((int) (rand.nextDouble()*500)+2000);
		
		return factoryCar;
	}

	private static Color randColor() {
		return Color.values()[rand.nextInt(Color.values().length)];
	}
	private static CarType randType() {
		return CarType.values()[rand.nextInt(Color.values().length)];
	}

}
