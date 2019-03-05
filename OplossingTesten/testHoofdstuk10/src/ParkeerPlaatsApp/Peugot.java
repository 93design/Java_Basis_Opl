package ParkeerPlaatsApp;

public class Peugot extends Auto{

	
		
	public Peugot(String brandName, double gewicht) {
		super(brandName, gewicht);
		// TODO Auto-generated constructor stub
	}

	public Peugot(Auto autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reFuel() {
		System.out.println("Deze auto loopt op diesel");
	}

}
