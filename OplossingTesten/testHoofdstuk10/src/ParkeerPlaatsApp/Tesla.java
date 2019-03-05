package ParkeerPlaatsApp;

public class Tesla extends Auto{

	public Tesla(Auto autoIn) {
		super(autoIn);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void reFuel() {
		System.out.println("loopt op electriciteit");		
	}
	
	

}
