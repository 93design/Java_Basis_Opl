package LaunchApp;

public class Rock implements Launchable,Skippable {

	
	

	@Override
	public void Launch() {
		System.out.println("Launching rock at surface of the water");
		
	}

	@Override
	public void Skipping() {
		System.out.println("Skipping on the water"); 
		
	}

}
