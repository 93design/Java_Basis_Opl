package frietkotSolved;

public class Fries implements Orderable, Fryable{
	
	private FriesSize size; 
	private double price; 
	private static int friesCount = 0;
	
	public Fries() {
		this(null);		
	}
	
	public Fries(FriesSize size) {
		this.size = size;
		calculatePrice();
		friesCount++;
	}

	private void calculatePrice() {
		price = size.getPrice();
	}
	
	public void setSize(FriesSize size) {
		this.size = size;
		calculatePrice();
	}

	@Override
	public void Fry() {
		System.out.println("smijt een " + size.name().toLowerCase() + " portie in de frietpot");	
	}

	@Override
	public double getPrice() {
		return price;
	}

}
