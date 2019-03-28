package garage;

/**
 * This interface describes the interaction with a Vehicle.  
 * @author Jamie Goegebeur
 */
public interface Moveable {

	/**
	 * This method accelerates the speed of the vehicle.
	 * 
	 * @param value The value to accelerate down. 
	 */
	void accelerate(double value);
	/**
	 * This method slows down the speed of the vehicle.
	 * 
	 * @param value The value to slow down. 
	 */
	void slowDown(double value);
	/**
	 * Gets the speed of the vehicle. 
	 * 
	 * @return The speed. 
	 */
	double getSpeed();
	
}
