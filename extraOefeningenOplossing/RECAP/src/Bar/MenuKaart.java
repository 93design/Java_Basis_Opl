package Bar;

import BubbleTea.*;


public enum MenuKaart {
	
	SOURGREEN(new BubbleTeaIngredient[] {new Apple(),new Apple(),new Orange()}),
	REDDELIGHT(new BubbleTeaIngredient[] {new Apple(),new Apple(),new Orange()}),
	VEGISOUR(new BubbleTeaIngredient[] {new Apple(), new Apple(),new Orange()});
	
	private BubbleTeaIngredient[] mix;
	
	MenuKaart(BubbleTeaIngredient[] teaIn) {
		this.mix = teaIn;
	}

	public BubbleTeaIngredient[] getMix() {
		return mix;
	}

	public void setMix(BubbleTeaIngredient[] mix) {
		this.mix = mix;
	}

	


}
