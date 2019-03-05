package BikeRackInheritance.copy;

public class MainApp {

	public static void main(String[] args) {


		Bicycle bicycle = new Bicycle(0, 0, 0);
		Bicycle bicycle2 = new MountainBike(0, 0, 0, 0);
		Bicycle bicycle3 = new OneWheel(0, 0, 0, 0);
		
		System.out.println(bicycle);
		System.out.println(bicycle);

	}

}
