package jamie;

public class Sellery extends Vegetable{

	private double price = 0.75;	
	@Override
	public void mix() {
		System.out.println("cut and clean the sellery");
	
	}
	@Override
	public double getPrice() {
		return this.price;
	}	

}
