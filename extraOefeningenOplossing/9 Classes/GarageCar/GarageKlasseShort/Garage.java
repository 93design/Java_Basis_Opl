package GarageKlasseShort;

public class Garage {
	
	private String name;

	public Garage(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Garage: " + this.name;
		
	}
	
	

}
