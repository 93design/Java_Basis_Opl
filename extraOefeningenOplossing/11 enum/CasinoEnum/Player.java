package CasinoEnum;

import java.util.Arrays;

public class Player {

	private double money;
	private Chip[] chips = new Chip[0];

	Player(double money) {
		this.money = money;
		calculateChips();
	}

	private void calculateChips() {
		double temp = money;
		while (temp > 0) {
if (temp % 10 == 0 || temp % 50 == 0) {
				
				if (temp > 50) {
					temp -= 50;
					addChip(new Chip(ChipColor.GOLD));
				} else {
					temp -= 10;
					addChip(new Chip(ChipColor.GREEN));
				}
			}else if (temp % 25 == 0 || temp % 5 == 0) {
				if (temp > 25) {
					temp -= 25;
					addChip(new Chip(ChipColor.BLACK));
				} else {
					temp -= 5;
					addChip(new Chip(ChipColor.RED));
				}
			}
			
		}
	}

	private void addChip(Chip chip) {
		chips = Arrays.copyOf(chips, chips.length + 1);
		chips[chips.length - 1] = chip;
	}

	public void printChips() {
		for (Chip chip : chips) {
			System.out.println(chip);
		}
	}

	public void printChipAmout() {
		int greenChips = 0;
		int redChips = 0;
		int blackChips = 0;
		int goldChips = 0;

		for (Chip chip : chips) {
			if (chip.getChipColor().equals(ChipColor.GREEN)) {
				greenChips++;
			} 
			if (chip.getChipColor().equals(ChipColor.RED)) {
				redChips++;
			}
			if (chip.getChipColor().equals(ChipColor.BLACK)) {
				blackChips++;
			}
			if (chip.getChipColor().equals(ChipColor.GOLD)) {
				goldChips++;
			}
		}
		System.out.println("redChips(5) =" + redChips);
		System.out.println("greenChips(10) =" + greenChips);
		System.out.println("blackChips(25) =" + blackChips);
		System.out.println("goldChips(50) =" + goldChips);

	}

	public void showTotalChipValue() {
		double totalChipValue = 0;
		for (Chip chip : chips) {
			totalChipValue += chip.getChipColor().getValue();
		}
		System.out.println(totalChipValue);
	}

}
