package BubbleTea;

public class Orange extends Fruit {
	

	private double price = 0.75;
	
	public Orange(double price) {
		super(price);
		this.price = price;
	}
	public Orange() {
	 this(0.75);
	}
	@Override
	public void boil() {
		System.out.println("adding Organge to the boil");
	}
	@Override
	public double getPrice() {
		return this.price;
	}

}
