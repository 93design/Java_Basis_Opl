package CasinoEnum;

public class Chip {
	
	private ChipColor chipColor;
	
	Chip(ChipColor color) {
		this.chipColor=color;
	}
	
	public ChipColor getChipColor() {
		return chipColor;
	}

	@Override
	public String toString() {
		return "Chip [chipColor=" + chipColor + "]";
	}
	
	

}
