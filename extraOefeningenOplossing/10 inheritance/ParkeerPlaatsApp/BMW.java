package ParkeerPlaatsApp;

public class BMW extends Car{

	private static double weight = 1200;
		
	public BMW(String brandName, double gewicht) {
		super(brandName, gewicht);
		// TODO Auto-generated constructor stub
	}

	public BMW(Car autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	public BMW(String brandName) {
		super(brandName, weight);
	}

	@Override
	public void reFuel() {
		System.out.println("Deze auto loopt op diesel");
		
	}

}
