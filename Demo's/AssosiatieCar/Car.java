package carEnginePassengerUML;

public class Car {
	
	private Engine engine = new Engine();
	private Passenger passenger;
	private FuelTank tank = new FuelTank(40);
	
	
	
	public Car(Passenger passenger) {
		super();
		this.passenger = passenger;
	}


	public float getMaxFuelCapacity() {
		return tank.getMAX_FUEL_CAPACITY();
	}

	public int getToSpeed() {
		int topSpeed = 150;
		return topSpeed;
	}
	
	public void reFuel() {
		tank.addFuel(60);
	}
	
	
	public void startCar() {
		if (engine.isEngineRunning()) {
			if(tank.getLitersFuel() <=0) {
				engine.stopEngine();
			} else {
				engine.startEngine();
				System.out.println("motor loopt, auto staat aan");			}
		
		} else {
			engine.startEngine();
		}		
	}
	
	public void stopCar() {
		engine.stopEngine();
		System.out.println("motor afgedraaid");
	}


	@Override
	public String toString() {
		return "Car is running: " + engine.isEngineRunning() + " en =" + passenger + "is aan het rijden met " + tank.getLitersFuel() + "l in de tank";
	}
	
	
	
	
}
