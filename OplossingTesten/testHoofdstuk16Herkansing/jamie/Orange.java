package jamie;

public class Orange extends Fruit {
	

	private double price = 0.75;	
	@Override
	public void mix() {
		System.out.println("peel and squiz the orange");
	}
	@Override
	public double getPrice() {
		return this.price;
	}

}
