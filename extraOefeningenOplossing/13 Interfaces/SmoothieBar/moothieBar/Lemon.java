package moothieBar;

public class Lemon extends Fruit implements Mixable {

	@Override
	public void Mix() {
		System.out.println("Cutting in half and then pressing");

	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0.75;
	}


}
