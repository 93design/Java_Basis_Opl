package frietkotSolved;

public class Beer extends Drink {

	private final double priceDrinkWater = 2; 
	public Beer(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPrice() {
		return priceDrinkWater;
	}
	
}
