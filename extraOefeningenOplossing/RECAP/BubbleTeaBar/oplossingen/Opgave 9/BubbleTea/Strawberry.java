package BubbleTea;

public class Strawberry extends Fruit {
	
	private double price = 0.75;

	public Strawberry(double price) {
		super(price);
	}

	public Strawberry() {
		this(0.75);
	}

	

	@Override
	public void boil() {
		System.out.println("clean and mush the strawberries");
	}

	@Override
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
