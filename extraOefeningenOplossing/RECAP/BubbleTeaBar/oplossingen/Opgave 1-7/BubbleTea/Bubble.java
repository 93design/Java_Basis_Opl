package BubbleTea;

public class Bubble extends BubbleTeaIngredient {

	private double price = 0.50;
	private Taste taste;

	/** inner enum classe van Bubble die onze smaken gaat vast leggen. */
	public enum Taste {
		SOURAPPLE, SWEETAPPLE, BLUEBERRY, STRAWBERRRY, LIME
	}

	public Bubble(Taste taste) {
		this(taste, 0.50);
		this.taste = taste;
	}

	public Bubble(Taste taste, double price) {
		super(price);
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
		return taste + " Bubble(" + price + ")";
	}

}
