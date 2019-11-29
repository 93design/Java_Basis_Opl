package BoatOktoberSolution;

public class BoatApp {

	public static void main(String[] args) {
		Captain cap3 = new Captain();
		Captain cap2 = new Captain();
		Captain cap1 = new Captain();
		cap1.setAge(72);
		cap1.setName("Jhone");
		DeckHand hand1 = new DeckHand("Fernand", 72,"duimpje");
		FischerBoat boat1 = new FischerBoat();
		speedBoat boat2 = new speedBoat();
		SailBoat boat3 = new SailBoat();
		SailBoat boat4 = new SailBoat(1200,30,cap1,"Leasure",18);

		boat3.setSailSize(14);
		boat3.setTopSpeed(12);
		boat3.setWeight(550);
		boat3.setName("king of namur");
		cap3.setAge(25);
		cap3.setName("Maarten");		
		boat3.setCaptain(cap3);

		boat2.setName("fastBoy");
		boat2.setHorsePower(255);
		boat2.setTopSpeed(122);
		boat2.setWeight(2000);
		cap2.setName("Justine");
		cap2.setAge(24);
		boat2.setCaptain(cap2);

		boat1.setName("Z54");
		boat1.setNetSize(60);
		boat1.setTopSpeed(40);
		boat1.setWeight(8000);
		boat1.setHand(hand1);		
		boat1.setCaptain(cap1);
		
		
		System.out.println(boat1.getName());
		System.out.println(boat2.getWeight());
		System.out.println(boat1.getNetSize());
		
		boat1.accelerate();
		boat2.accelerate();
		boat3.accelerate();

		//printBoat(boat3);
		//printBoat(boat2);
		//printBoat(boat1);
	}

	private static void printBoat(SailBoat boat3) {
		System.out.println(boat3.getName());
		System.out.println(boat3.getTopSpeed());
		System.out.println(boat3.getWeight());
		System.out.println(boat3.getName());
		System.out.println(boat3.getCaptain());
		boat3.accelerate();

	}

	private static void printBoat(FischerBoat boat1) {
		System.out.println(boat1.getName());
		System.out.println(boat1.getNetSize());
		System.out.println(boat1.getTopSpeed());
		System.out.println(boat1.getWeight());
		System.out.println(boat1.getCaptain());
		boat1.accelerate();
	}

private static void printBoat(speedBoat boat2) {
	System.out.println(boat2.getName());
	System.out.println(boat2.getTopSpeed());
	System.out.println(boat2.getWeight());
	System.out.println(boat2.getCaptain());
	boat2.accelerate();
}
}