package frietkotSolved;

public abstract class Drink implements Orderable {
	
	private String name;
	
	
	public Drink(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
