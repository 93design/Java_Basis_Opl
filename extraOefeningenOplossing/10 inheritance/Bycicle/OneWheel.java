package BikeRackInheritance.copy;

public class OneWheel extends Bicycle {

	public int seatHeight;
	private final int gear = 1;

	// the Onewheel subclass has one constructor
	public OneWheel(int startHeight, int startCadence, int startSpeed, int startGear) {
		super(startCadence, startSpeed, 1);
		seatHeight = startHeight;
	}

	// the Onewheel subclass adds one method
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		return "OneWheel [seatHeight=" + seatHeight + ", gear=" + gear + "]";
	}
	
	

}