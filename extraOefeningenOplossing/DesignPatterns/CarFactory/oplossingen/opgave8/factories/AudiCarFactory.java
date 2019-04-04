package factories;

import java.util.Random;

import garage.Cabriolet;
import garage.Car;
import garage.Color;
import garage.FamilyCar;
import garage.SportCar;

public abstract class AudiCarFactory {
	
	private static Random rand = new Random();

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
			 	factoryCar.setModelName("Roadster"); 
			 	break;
		 case FAMILY: 
			 	factoryCar = new FamilyCar(); 
			 	factoryCar.setType(CarType.FAMILY);
			 	factoryCar.setModelName("Model S"); 
			 	break;
		 case SPORT: 
			 	factoryCar = new SportCar(); 
			 	factoryCar.setType(CarType.SPORT);
			 	factoryCar.setModelName("Model X"); 
			 	break;
		 default: factoryCar = null;
		}
		factoryCar.accelerate(0);
		factoryCar.setColor(randColor());
		factoryCar.setWeight((int) (rand.nextDouble()*500)+2000);
		
		return factoryCar;
	}

	private static Color randColor() {
		int l = Color.values().length;
		int temp = rand.nextInt(l-1);
		return Color.values()[temp];
	}
	private static CarType randType() {
		return CarType.values()[2];
	}

}
