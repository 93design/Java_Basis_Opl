package garage;

import java.util.Iterator;

/**
 * This represents an abstract implementation of a Car. 
 *  @author Jamie Goegebeur
 */
public abstract class Car implements Moveable{

	/** The number of wheels of a car. */
	public static final int NUMBER_OF_WHEELS = 4;
	
	private static int count;
	
	private Color color;
	
	private double speed;
	
	/** Constructor. */
	public Car(){
		this(Color.WHITE);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param color The color.
	 */
	public Car(Color color){
		setColor(color);
		count++;
	}

	/**
	 * Gets the color. 
	 * @return The color. 
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the color.  
	 * @param color The color. 
	 */
	public void setColor(Color color) {
		if (color != null) {
			this.color = Color.WHITE;
		} else {
			this.color = color;	
		}
		
	}
	
	@Override
	public double getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = (speed<0)? 0.0 : speed;
	} 
	
	/**
	 * Gets the count of Car instances.
	 * @return The count of Car instances. 
	 */
	public static int getCount() {
		return count;
	}

	@Override
	protected void finalize() throws Throwable {
		count--;
		
	}
	
}
