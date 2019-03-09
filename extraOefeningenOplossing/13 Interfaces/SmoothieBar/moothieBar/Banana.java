package moothieBar;

public class Banana implements Mixable {

	@Override
	public void Mix() {
		System.out.println("first peeling then mashing the Banana");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1.25;
	}

}
