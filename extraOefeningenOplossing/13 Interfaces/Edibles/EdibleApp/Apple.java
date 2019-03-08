package EdibleApp;

public class Apple extends Fruit implements Edible {

	private String name;
	
	@Override
	public String howToEat() {
		String wayToEat = "eerste schillenen dan in reepjes";
		return wayToEat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + "]";
	}

	public Apple(String name) {
		this.name = name;
	}
	
	public Apple() {
		
	}
}
