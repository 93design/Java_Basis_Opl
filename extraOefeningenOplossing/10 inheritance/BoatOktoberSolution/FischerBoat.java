package BoatOktoberSolution;

public class FischerBoat extends Boat {
	public double netSize;
	public DeckHand hand;

	public FischerBoat() {
		super();
	}

	public FischerBoat(double weight, double topSpeed, Captain captain, String name, double netSize, DeckHand hand) {
		super(weight, topSpeed, captain, name);
		this.netSize = netSize;
		this.hand = hand;
	}

	public double getNetSize() {
		return netSize;
	}

	public void setNetSize(double netSize) {
		this.netSize = netSize;
	}

	public DeckHand getHand() {
		return hand;
	}

	public void setHand(DeckHand hand) {
		this.hand = hand;
	}

	@Override
	public void accelerate() {
		System.out.println("de visser takelt het net op en gaat zo sneller vooruit");
	}

	public void addHand(DeckHand handIn) {
		this.hand = handIn;
	}

}
