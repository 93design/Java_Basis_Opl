package BoatOktoberSolution;

public abstract class Boat {
	private double weight;
	private double topSpeed;
	public Captain captain;
	private String name;
	
	
	
	


public Boat() {
		super();
	}




public Boat(double weight, double topSpeed, Captain captain, String name) {
		super();
		this.weight = weight;
		this.topSpeed = topSpeed;
		this.captain = captain;
		this.name = name;
	}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public Captain getCaptain() {
	return captain;
}

public void setCaptain(Captain captain) {
	this.captain = captain;
}

public double getWeight() {
		return weight;
	}

public void setWeight(double weight) {
		this.weight = weight;
	}

public double getTopSpeed() {
		return topSpeed;
	}

public void setTopSpeed(double topSpeed) {
		this.topSpeed = topSpeed;
	}

public abstract void accelerate();
	
	
	

}
