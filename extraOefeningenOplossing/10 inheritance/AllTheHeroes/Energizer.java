package HeroOefening;

public class Energizer extends Hero {

	public Energizer() {
		this("", 0);
		// TODO Auto-generated constructor stub
	}

	public Energizer(String alias) {
		this(alias, 0);
	}

	public Energizer(String alias, int age) {
		super();
		this.setAlias(alias);
		this.setAge(age);
	}
	
	@Override
	public void useSuperPower() {
		// TODO Auto-generated method stub

	}

}
