package garage;

/**
 * This class represents the behavior of a family car. 
 *  @author Jamie Goegebeur
 */
public class FamilyCar extends Car{
	
	/** The number of seats. */
	public static final int NUMBER_OF_SEATS = 4;
	
	private static int countFamily;
	
	/** Constructor. */
	public FamilyCar(){
		this(Color.WHITE);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param color The color.
	 */
	public FamilyCar(Color color){
		super(color);
		countFamily++;
	}
	
	@Override
	public void accelerate(double value) {
		value = (value<0)? -value : value;
		setSpeed(getSpeed() + value);
	}

	@Override
	public void slowDown(double value) {
		value = (value<0)? -value : value;
		setSpeed(getSpeed() - value);
	}

	
	/**
	 * Gets the count of FamilyCar instances.
	 * @return The count of FamilyCar instances. 
	 */
	public static int getCount() {
		return countFamily;
	}
	@Override
	public boolean equals(Object object) {
		boolean value;
		if(object instanceof FamilyCar){
			FamilyCar that = (FamilyCar) object;
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
	protected void finalize() throws Throwable {
		this.countFamily--;
		super.finalize();
	}

	

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getClass().getName());
		stringBuilder.append(" speed = " + getSpeed());
		stringBuilder.append(" color = " + getColor());
		return stringBuilder.toString();
	}
	

	
}
