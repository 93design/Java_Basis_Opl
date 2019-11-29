package ParkeerPlaatsApp;

public class Audi extends Car{

	private static double weight = 1200;
		
	public Audi(String brandName, double gewicht) {
		super(brandName, gewicht);
		// TODO Auto-generated constructor stub
	}

	public Audi(Car autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	public Audi(String brandName) {
		super(brandName, weight);
	}

	@Override
	public void reFuel() {
		System.out.println("Deze auto loopt op diesel");
		
	}

}
