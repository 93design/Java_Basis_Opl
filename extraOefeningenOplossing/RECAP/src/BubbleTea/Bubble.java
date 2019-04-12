package BubbleTea;

public class Bubble extends BubbleTeaIngredient {

	private double price = 0.50;
	private Taste taste;

	public enum Taste {
		SOURAPPLE, SWEETAPPLE, BLUEBERRY, STRAWBERRRY, LIME
	}

	public Bubble(Taste taste) {
		this.taste = taste;
	}

	public Bubble(Taste taste, double price) {
		this.taste = taste;
		this.price = price;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	public Taste getTaste() {
		return taste;
	}

	@Override
	public String toString() {
		return  taste + " Bubble" ;
	}
	
	
	
	

}
