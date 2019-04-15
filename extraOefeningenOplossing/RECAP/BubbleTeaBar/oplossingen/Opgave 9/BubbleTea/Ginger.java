package BubbleTea;

public class Ginger extends Spice{

	private double price = 0.75;
	public Ginger() {
		super(0.75);
	}
	
	public Ginger(double price) {
		super(price);
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
