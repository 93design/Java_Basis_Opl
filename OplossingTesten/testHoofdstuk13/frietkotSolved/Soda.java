package frietkotSolved;

public class Soda extends Drink {

	
	private final double priceDrinkWater = 2; 
	public Soda(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Soda() {
		this("");
	}

	@Override
	public double getPrice() {
		return priceDrinkWater;
	}
	
}
