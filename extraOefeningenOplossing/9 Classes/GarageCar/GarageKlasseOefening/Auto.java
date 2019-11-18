package GarageKlasseOefening;

public class Auto {
	
	private String naam;
	private Garage garage;
	
	public Auto(String naam) {
		super();
		this.naam = naam;
	}
	
	
	public Auto(String naam, Garage garage) {
		super();
		this.naam = naam;
		this.garage = garage;
	}

	
	public Auto(Auto autoIn) {
		super();
		this.garage = autoIn.garage;
		this.naam = autoIn.naam;
		 
	}

	public String getNaam() {
		return naam;
	}


	public void setNaam(String naam) {
		this.naam = naam;
	}


	public Garage getGarage() {
		return garage;
	}


	public void setGarage(Garage garage) {
		this.garage = garage;
	}


	@Override
	public String toString() {
		return "Auto [naam=" + naam + ", garage=" + garage + "]";
	}


}
