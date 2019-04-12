package BubbleTea;

public class Cinamon extends Spice {

	private double price = 0.75;	
	
	public Cinamon(double price) {
		this.price = price;
	}

	public Cinamon() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void boil() {
		System.out.println("adding Cinamon to the boil");
	}
	@Override
	public double getPrice() {
		return price;
	}
	
	

}
