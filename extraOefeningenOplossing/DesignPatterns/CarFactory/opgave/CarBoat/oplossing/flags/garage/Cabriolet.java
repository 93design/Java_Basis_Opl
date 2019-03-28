package garage;

/**
 * This class represents the behavior of a cabriolet. 
 *  @author Jamie Goegebeur
 */
public class Cabriolet extends FamilyCar {

	private static int count;
	
	private boolean openRoof;
	
	/** Constructor. */
	public Cabriolet(){
		this(Color.WHITE, false);
	}
	
	/**
	 * Constructor.
	 * 
	 * @param color The color.
	 * @param openRoof The open roof.
	 */
	public Cabriolet(Color color, boolean openRoof){
		super(color);
		this.openRoof = openRoof;
		count++;
	}
	
	/**
	 * Gets the open roof. 
	 * @return The open roof. 
	 */
	public boolean isOpenRoof() {
		return openRoof;
	}

	/**
	 * Sets the open roof. 
	 * @param openRoof The open roof. 
	 */
	public void setOpenRoof(boolean openRoof) {
		this.openRoof = openRoof;
	}

	/**
	 * Gets the count of Cabriolet instances.
	 * @return The count of Cabriolet instances. 
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
		if(object instanceof Cabriolet){
			Cabriolet that = (Cabriolet) object;
			value = this.getSpeed()==that.getSpeed() && this.getColor().equals(that.getColor())
					&& this.openRoof==that.openRoof;
		} else {
			value = false;
		}
		return value;
	}

	@Override
	public int hashCode() {
		return (int) getSpeed() ^ getColor().getRgb();
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(getClass().getName());
		stringBuilder.append(" speed = " + getSpeed());
		stringBuilder.append(" color = " + getColor().name());
		stringBuilder.append(" openRoof = " + openRoof);
		return stringBuilder.toString();
	}

}
