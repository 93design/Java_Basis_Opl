package moothieBar;

public class Apple extends Vegetable implements Mixable {

	@Override
	public void Mix() {
		System.out.println("Apple is Mashed and added");

	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0.5;
	}

}
