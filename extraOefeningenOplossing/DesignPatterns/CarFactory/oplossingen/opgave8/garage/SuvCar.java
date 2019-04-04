package garage;

/**
 * This class represents the behavior of a Sport car. 
 *  @author Jamie Goegebeur
 */
public class SuvCar extends Car{
	
	/** The number of seats. */
	public static final int NUMBER_OF_SEATS = 2;
	
	private static int count;
	
	private static double ACCELERATION_FACTOR = 0.9;
	
	/** Constructor. */
	public SuvCar(){
		this(Color.WHITE);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param color The color.
	 */
	public SuvCar(Color color){
		super(color);
		count++;
	}
	

	@Override
	public void accelerate(double value) {
		value = (value<0)? -value : value;
		setSpeed(getSpeed() + ACCELERATION_FACTOR * value);
	}

	@Override
	public void slowDown(double value) {
		value = (value<0)? -value : value;
		setSpeed(getSpeed() - ACCELERATION_FACTOR * value);
	}
	
	/**
	 * Gets the count of SportCar instances.
	 * @return The count of SportCar instances. 
	 */
	public static int getCount() {
		return count;
	}

	@Override
	protected void finalize() throws Throwable {
		count--;
		super.finalize();
	}
	@Override
	public boolean equals(Object object) {
		boolean value;
		if(object instanceof SuvCar){
			SuvCar that = (SuvCar) object;
			value = this.getSpeed() == that.getSpeed() && this.getColor().equals(that.getColor());
		} else {
			value = false;
		}
		return value;
	}

	@Override
	public int hashCode() {
		return (int)getSpeed() ^ getColor().getRgb();
	}

	
	

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SC: ");
		stringBuilder.append(" speed = " + (int) getSpeed());
		stringBuilder.append(" color = " + getColor().name());
		return stringBuilder.toString();
	}

}
