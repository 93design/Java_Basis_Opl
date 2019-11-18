package GarageKlasseShort;

public class Auto {
	
	private String brand;
	private Garage garage;
	
	
	public Auto(String brand) {
		this(brand,null);		
	}
	
	public Auto(String brand, Garage garage) {
		super();
		this.brand = brand;
		this.garage = garage;
	}
	public Auto(Auto auto) {
		this.brand = auto.brand;
		this.garage = auto.garage;
		//this(auto.brand,auto.garage);		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Garage getGarage() {
		return garage;
	}

	public void setGarage(Garage garage) {
		this.garage = garage;
	}

	@Override
	public String toString() {
		return "Auto [brand=" + brand + ", garage=" + garage + "]";
	}
	
	
	

}
