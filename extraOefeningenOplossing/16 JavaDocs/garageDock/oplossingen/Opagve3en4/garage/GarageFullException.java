package garage;

/**
 * This class represents the exception when the garage id full.   
 * @author Jamie Goegebeur
 */
public class GarageFullException extends Exception{

	private static final long serialVersionUID = -7520280918157414421L;

	/**
	 * Constructor. 
	 * @param message The message. 
	 */
	public GarageFullException(String message){
		super(message);
	}
}
