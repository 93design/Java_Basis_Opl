package garage;

/**
 * This class represents the exception when the vehicle is already in the garage.   
 *  @author Jamie Goegebeur
 */
public class VehicleAlreadyInGarageException extends Exception{

	private static final long serialVersionUID = 6700128813826374329L;


	/**
	 * Constructor. 
	 * @param message The message. 
	 */
	public VehicleAlreadyInGarageException(String message){
		super(message);
	}
}
