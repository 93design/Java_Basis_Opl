package ParkeerPlaatsApp;

public class Tesla extends Car{

	private static double weight = 1200;
		
	public Tesla(String brandName, double gewicht) {
		super(brandName, gewicht);
		// TODO Auto-generated constructor stub
	}

	public Tesla(Car autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	public Tesla(String brandName) {
		super(brandName, weight);
	}

	@Override
	public void reFuel() {
		System.out.println("Deze auto loopt op diesel");
		
	}

}
