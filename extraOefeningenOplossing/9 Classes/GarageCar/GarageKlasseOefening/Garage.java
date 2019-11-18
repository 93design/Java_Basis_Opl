package GarageKlasseOefening;

public class Garage {

	private String naam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Garage(String naam) {
		super();
		this.naam = naam;
	}

	@Override
	public String toString() {
		return naam;
	}
	
	
}
