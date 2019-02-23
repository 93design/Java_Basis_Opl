package HeroOefening;

public class ArmoredHero extends Hero {

	public ArmoredHero() {
		this("", 0);
		// TODO Auto-generated constructor stub
	}

	public ArmoredHero(String alias) {
		this(alias, 0);
	}

	public ArmoredHero(String alias, int age) {
		super();
		this.setAlias(alias);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		// TODO Auto-generated method stub

	}

}
