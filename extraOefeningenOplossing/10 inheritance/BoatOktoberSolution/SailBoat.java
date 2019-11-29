package BoatOktoberSolution;

public class SailBoat extends Boat{
	public double sailSize;

	public SailBoat() {
		super();
	}
	public SailBoat(double weight, double topSpeed, Captain captain, String name, double sailSize) {
		super(weight, topSpeed, captain, name);
		this.sailSize = sailSize;
	}
	public double getSailSize() {
		return sailSize;
	}
	public void setSailSize(double sailSize) {
		this.sailSize = sailSize;
	}
	
	@Override
	public void accelerate() {
	System.out.println("De wind blaast de zeilen bol en versnelt het schip");
	}

	
	

}
