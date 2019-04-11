package jamie;

public class Apple extends Fruit {
		

	private double price = 1;	
	enum Type {
		SOUR,SWEET;
	}
	
	Type taste;

	Apple(Type type) {
		this.taste = type;
	}
	@Override
	public void mix() {
		System.out.println("peel and cut aplle");
		
	}
	@Override
	public double getPrice() {
		return this.price;
	}

}
