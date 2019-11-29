package BoatOktoberSolution;

public class speedBoat extends Boat{
public int horsePower;


public speedBoat() {
	super();
}


public speedBoat(double weight, double topSpeed, Captain captain, String name, int horsePower) {
	super(weight, topSpeed, captain, name);
	this.horsePower = horsePower;
}


public int getHorsePower() {
	return horsePower;
}


public void setHorsePower(int horsePower) {
	this.horsePower = horsePower;
}


@Override
public void accelerate() {

	System.out.println("de fastyBoy gaat in hogere versnelling");
	
}








	

}
