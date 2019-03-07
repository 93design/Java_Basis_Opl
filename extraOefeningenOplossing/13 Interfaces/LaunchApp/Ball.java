package LaunchApp;

public  class Ball implements Launchable {

	private String brandName;
	public Ball(String string) {
		this.brandName = string;
	}
	
	
	public void Bounce() {
		System.out.println("basic ball bounce");
	}


	@Override
	public void Launch() {
		System.out.println("Basic ball launched");
		
	}
	
	
}
