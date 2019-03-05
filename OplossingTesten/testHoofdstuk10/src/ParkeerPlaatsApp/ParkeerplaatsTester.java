package ParkeerPlaatsApp;

public class ParkeerplaatsTester {

	public static void main(String[] args) {
		
		
		Auto peugot = new Peugot("Peugot", 1200);
		
		ParkeerPlaats kouter = new ParkeerPlaats();
		
		kouter.addAutos(peugot);

		
		kouter.printParkeerLayout();
	}

}
