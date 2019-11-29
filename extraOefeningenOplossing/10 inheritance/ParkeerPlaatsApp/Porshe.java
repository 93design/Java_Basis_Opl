package ParkeerPlaatsApp;

public class Porshe extends Car{

	private static double weight = 1200;
		
	public Porshe(String brandName, double gewicht) {
		super(brandName, gewicht);
		// TODO Auto-generated constructor stub
	}

	public Porshe(Car autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	public Porshe(String brandName) {
		super(brandName, weight);
	}

	@Override
	public void reFuel() {
		System.out.println("Deze auto loopt op diesel");
		
	}

}
