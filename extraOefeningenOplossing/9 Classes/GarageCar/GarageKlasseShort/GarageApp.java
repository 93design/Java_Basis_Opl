package GarageKlasseShort;

public class GarageApp {

	public static void main(String[] args) {
	
		Garage garageA = new Garage("Verstreaten NV");
		Garage garageB = new Garage("BMW zuid");
		Garage garageC = new Garage("BMW noord");
				
		System.out.println(garageA);
		
		Auto autoA = new Auto("BMW Z4", garageA); 
		Auto autoB = new Auto("BMW Z4", garageA); 
		Auto autoC = new Auto("BMW I8", garageC); 
		
		System.out.println(autoA);
		
		
		autoC.setGarage(garageB);
		
		
		System.out.println(autoC);
		
		garageB.setName("BMW-Mini zuid");
		

		System.out.println(autoC);
	}

}
