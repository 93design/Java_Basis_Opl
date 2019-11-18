package RocketOefTest;

public class Rocket {
	
	
	private int speed; 
	private Tank fuelTank = new Tank();
	private RocketEngine engine = new RocketEngine();
	private Person pilot; 
	private double payLoad;
	
	
	public Rocket(int tankIn, double payLoad) {
		this.fuelTank.setFuelLevel(tankIn);
		this.payLoad = payLoad;
	}
	
	public Rocket(int tankIn,  double payLoad, Person pilotIn) {
		this.fuelTank.setFuelLevel(tankIn);
		this.pilot = pilotIn;
		this.payLoad = payLoad;
	}

	public void setPilot(Person pilotIn) {
		this.pilot = pilotIn;
	}


	public void setUsage(int usageIn) {
		this.engine.setUsage(usageIn);		
	}

	
	public void LiftOff() {
		System.out.println("We got lift off Baby!!! ");
	}
	
	public double calcDistance() {
		return fuelTank.getFuelLevel()/(payLoad * engine.getUsage());
	}
}
