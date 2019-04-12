package BubbleTea;

public class Ginger extends Spice{

	private double price = 0.75;
	public Ginger() {
		super();
	}
	
	public Ginger(double price) {
		this.price = price;
	}
	@Override
	public void boil() {
		System.out.println("adding ginger to the boil");
	}
	
	@Override
	public double getPrice() {
		return this.price;
	}	

}
