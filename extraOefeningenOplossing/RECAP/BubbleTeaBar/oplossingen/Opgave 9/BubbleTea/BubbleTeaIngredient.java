package BubbleTea;

public abstract class BubbleTeaIngredient {
	
	private double price;	
	public BubbleTeaIngredient(double price) {
		this.price = price;
	}
	public abstract double getPrice();
	@Override
	
	public String toString() {
		return this.getClass().getSimpleName() + "(" + price + ")";
	}
	
	

}
