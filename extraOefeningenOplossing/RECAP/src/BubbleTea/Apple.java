package BubbleTea;

public class Apple extends Fruit {
		

	private double price = 1;	
	
	public Apple(int price) {
		this.price = price;
	}
	public Apple() {
		
	}
	@Override
	public void boil() {
		System.out.println("Adding Apple to the boil");
		
	}
	@Override
	public double getPrice() {
		return this.price;
	}

}
