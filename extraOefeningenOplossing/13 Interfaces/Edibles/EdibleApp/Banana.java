package EdibleApp;

public class Banana extends Fruit implements Edible {

	@Override
	public String howToEat() {
		String wayToEat = "eerst ontschillen";
		return wayToEat;
	}

}
