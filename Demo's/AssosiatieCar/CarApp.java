package carEnginePassengerUML;

public class CarApp {

	public static void main(String[] args) {
		
		
			Passenger jamie = new Passenger("jamie");
			Car peugot = new Car(jamie);
			peugot.startCar();
			
			System.out.println(peugot);
	}

}
