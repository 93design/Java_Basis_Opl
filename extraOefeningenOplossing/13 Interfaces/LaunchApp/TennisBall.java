package LaunchApp;

public class TennisBall extends Ball{

	public TennisBall(String string) {
		super(string);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Launch() {
		System.out.println("Launching my baal in the air for service");
	}

	@Override
	public void Bounce() {
		System.out.println("bouncing my ball 3 times before service");
	}

}
