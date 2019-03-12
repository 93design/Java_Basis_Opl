package frietkotSolved;

public enum FriesSize {

	SMALL(1.5),MEDIUM(2.5),BIG(3),FAMILY(5);
	
	private double price;
	
	FriesSize(double price){
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
}
