package ParkeerPlaatsApp;

public class BMW extends Auto{

	public BMW(Auto autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reFuel() {
		System.out.println("deze auto loopt op diesel");
	}

	
}
