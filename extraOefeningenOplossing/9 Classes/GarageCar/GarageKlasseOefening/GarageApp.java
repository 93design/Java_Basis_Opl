package GarageKlasseOefening;

public class GarageApp {

	public static void main(String[] args) {
	
		Garage garageA = new Garage("Verstraete NV");	
		Garage garageB = new Garage("BMW ZuidPoort");	
		Garage garageC = new Garage("BMW West");	
		Garage garageD = new Garage("Alfa Ronse");	
		
		//auto's gekocht en bij dezelfde garage gebleven. 
		Auto autoA = new Auto("BMW Z4", garageA); 
		Auto autoB = new Auto("BMW 106", garageB); 
		Auto autoC = new Auto("Alfa Romeo Stelvio", garageD); 
		
		
		System.out.println(" auto's gekocht en direct garage gekozen");	
		System.out.println("autoA" + autoA);		
		System.out.println("autoB" +autoB);
		System.out.println("autoC" +autoC);
		
		//auto importeren en pas nadien garage kiezen
		Auto autoD = new Auto("BMW I8"); 
		autoD.setGarage(garageC);		
		
		System.out.println("\n auto importeren en pas nadien garage kiezen");	
		System.out.println("autoC" +autoC);
		
		//Veranderen van garage
		System.out.println("\n veranderen van garage");
		System.out.println("autoC" +autoC);
		autoB.setGarage(garageC);		
		System.out.println("autoC" +autoC);
		
		//weten dat je een dezeflde auto wil als je buur
		System.out.println("\n auto Copy van buurman");
		Auto autoE = new Auto(autoD);
		System.out.println("autoC" +autoC);		
		System.out.println("autoE" +autoE);
		
		
		//alle auto's
//		System.out.println(autoA);		
//		System.out.println(autoB);
//		System.out.println(autoC);
//		System.out.println(autoD);
//		System.out.println(autoE);
		
	}

}
