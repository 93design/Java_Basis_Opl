package frietkotSolved;

public class Sauce implements Orderable{

	private String name;
	private final double price = 0.8;
	
	public Sauce(String name) {
		this.name = name;
	}
	
	public Sauce() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice( ) {
		return this.price;
	}
}
