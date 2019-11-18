package RocketOefTest;

public class RocketApp {

	public static void main(String[] args) {
		
		Person pilot1 = new Person(42, "Douglas");
		Person pilot2 = new Person(65, "Han");

		Rocket rocket1 = new Rocket(150_000_000, 200, pilot1);

		Rocket rocket2 = new Rocket(25_000_000, 250);
		rocket2.setPilot(pilot2);
		rocket2.setUsage(60);

		Rocket rocket3 = new Rocket(40_000_000, 20);

		System.out.println("rocket1: " + rocket1.calcDistance());

		System.out.println("rocket2: " + rocket2.calcDistance());

		System.out.println("rocket3: " + rocket3.calcDistance());

	}

}
