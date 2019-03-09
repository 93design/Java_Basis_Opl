package moothieBar;

public class Spinache extends Vegetable implements Mixable {

	@Override
	public void Mix() {
		System.out.println("Mashing and and adding to blender");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1.25;
	}

}
