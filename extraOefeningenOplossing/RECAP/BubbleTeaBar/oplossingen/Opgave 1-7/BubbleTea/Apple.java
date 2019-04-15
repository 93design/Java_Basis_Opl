package BubbleTea;

public class Apple extends Fruit {
		

	private double price = 1;	
	
	public Apple(int price) {
		super(price);
		this.price = price;
		
	}
	public Apple() {
		this(1);
	}
	@Override
	public void boil() {
		System.out.println("	Adding Apple to the boil");
		
	}
	@Override
	public double getPrice() {
		return this.price;
	}

}
