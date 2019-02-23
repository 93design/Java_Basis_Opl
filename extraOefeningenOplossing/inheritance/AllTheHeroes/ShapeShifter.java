package HeroOefening;

public class ShapeShifter extends Hero {
	
	public ShapeShifter() {
		this("", 0);
		// TODO Auto-generated constructor stub
	}

	public ShapeShifter(String alias) {
		this(alias, 0);
	}

	public ShapeShifter(String alias, int age) {
		super();
		this.setAlias(alias);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		// TODO Auto-generated method stub

	}

}
