package EdibleApp;

public class Chicken extends Animal implements Edible{

	@Override
	public String howToEat() {
		String eatStyle = "Aaan het spit";
		return eatStyle;
	}

}
