package HeatException;

public class ExtremeHeatException extends Exception{
	public ExtremeHeatException() {
		super();
	}
	public ExtremeHeatException(String message) {
		super(message);
	}
	public ExtremeHeatException(String message, Throwable cause) {
		super(message,cause);
	}
	public ExtremeHeatException(Throwable cause) {
		super(cause);
	}
}
