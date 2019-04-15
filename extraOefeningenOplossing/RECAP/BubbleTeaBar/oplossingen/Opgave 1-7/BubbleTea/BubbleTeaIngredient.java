package BubbleTea;

public abstract class BubbleTeaIngredient {
	
	private double price;	
	public BubbleTeaIngredient(double price) {
		this.price = price;
	}
	/**
	 * returns the price of the item*/
	public abstract double getPrice();
	
	/**
	 * @returns a custom toString based on the name and price*/
	@Override	
	public String toString() {
		return this.getClass().getSimpleName() + "(" + price + ")";
	}
	
	

}
