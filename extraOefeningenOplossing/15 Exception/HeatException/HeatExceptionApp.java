package HeatException;

public class HeatExceptionApp {

	public static void main(String[] args) {

		try {
			learnAtCertainTemperature(20);
		} catch (ExtremeHeatException e) {

			e.printStackTrace();

		}

	}

	public static void learnAtCertainTemperature(int temperature) throws ExtremeHeatException {
		if (temperature > 5 && temperature < 28) {
			System.out.println("What a nice temperature for learning!");
			System.out.println("the world is my oister");
			System.out.println("bring it on!");
		} else {
			throw new ExtremeHeatException();
		}
	}

}
