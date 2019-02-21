package carEnginePassengerUML;

public class Engine {

	private boolean engineRunning;	
	
	public void startEngine( ) {
		engineRunning = true;
	}
	public void stopEngine( ) {
		engineRunning = false;
	}
	
	public boolean isEngineRunning() {
		if(engineRunning) {
			System.out.println("Engine is running");
		} else {
			System.out.println("Engine is shutoff");
		}
		return engineRunning;
	}

}
