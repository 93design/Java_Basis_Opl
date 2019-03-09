package CasinoEnum;

public enum ChipColor {

	
	RED(5),GREEN(10),BLACK(25),GOLD(50);
	
	private int value;	
	
	ChipColor(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}


}
