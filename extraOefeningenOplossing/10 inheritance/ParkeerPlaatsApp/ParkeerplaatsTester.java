package ParkeerPlaatsApp;

public class ParkeerplaatsTester {

	public static void main(String[] args) {
		
		Car peugot3 = new Peugot("Peugot");
		Car peugot = new Peugot("Peugot", 1400);
		Car peugot2 = new Peugot("Peugot", 1000);		
		Car peugot4 = new Peugot("Peugot", 1200);
		Car peugot5 = new Peugot("Peugot", 1000);
		
		ParkeerPlaats kouter = new ParkeerPlaats("Kouter");
		ParkeerPlaats standaard = new ParkeerPlaats();
		
		kouter.addAutos(peugot);
		kouter.addAutos(peugot2);
		kouter.addAutos(peugot3);
		kouter.addAutos(peugot4);
		kouter.addAutos(peugot5);

		//kouter.printParkeerLayout();
		
		System.out.println("\n adding porshe");
		Car porshe1 = new Porshe("Porshe");		
		Car porshe2 = new Porshe("Porshe",2000);		
		Car porshe3 = new Porshe("Porshe",900);		
		Car porshe4 = new Porshe("Porshe",1900);
		Car porshe5 = new Porshe("Porshe",1500);
		
		
		kouter.addAutos(porshe1);
		kouter.addAutos(porshe2);
		kouter.addAutos(porshe3);
		kouter.addAutos(porshe4);
		kouter.addAutos(porshe5);

		//kouter.printParkeerLayout();
		
		kouter.removeCar(5);
		kouter.printParkeerLayout();
		
	}

}
