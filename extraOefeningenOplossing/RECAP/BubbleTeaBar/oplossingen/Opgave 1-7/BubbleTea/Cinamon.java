package BubbleTea;

public class Cinamon extends Spice {

	private double price = 0.75;	
	
	public Cinamon(double price) {
		super(price);
		this.price = price;
	}

	public Cinamon() {
		this(0.75);
	}

	@Override
	public void boil() {
		System.out.println("	adding Cinamon to the boil");
	}
	@Override
	public double getPrice() {
		return price;
	}
	
	

}
