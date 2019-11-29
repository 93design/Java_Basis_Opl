package ParkeerPlaatsApp;

public class Peugot extends Car{

	private static double weight = 1200;
		
	public Peugot(String brandName, double gewicht) {
		super(brandName, gewicht);
		// TODO Auto-generated constructor stub
	}

	public Peugot(Car autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	public Peugot(String brandName) {
		super(brandName, weight);
	}

	@Override
	public void reFuel() {
		System.out.println("Deze auto loopt op diesel");
		
	}

}
