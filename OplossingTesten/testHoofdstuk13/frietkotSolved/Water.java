package frietkotSolved;

public class Water extends Drink{

	private final double priceDrinkWater = 2; 
	public Water(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public Water() {
		this("");
	}

	@Override
	public double getPrice() {
		return priceDrinkWater;
	}
	
	

}
