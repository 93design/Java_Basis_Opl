package LaunchApp;

public class BasketBall extends Ball{

	public BasketBall(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Launch() {
		System.out.println("Throwing a freethrow");
	}

	@Override
	public void Bounce() {
		System.out.println("bouncing off the rim");
		
	}

	

	
}
