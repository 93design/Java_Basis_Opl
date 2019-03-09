package moothieBar;

public class Smoothie {

	Mixable[] ingredients = new Mixable[0];

	Smoothie(SmoothieTypes type) {
		this(type.ingredient);
	}

	Smoothie(Mixable[] ingredients) {
		this.ingredients = ingredients;
	}

	public void mixSmoothie() {
		for(Mixable e: ingredients) {
			e.Mix();
		}
		
	}

}
