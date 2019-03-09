package moothieBar;

public class Celery extends Vegetable implements Mixable {

	@Override
	public void Mix() {
		System.out.println("Cutting in pieces and adding to blender");
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1;
	}

}
