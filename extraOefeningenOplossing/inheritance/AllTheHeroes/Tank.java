package HeroOefening;


public class Tank extends Hero {
	
	public Tank() {
		this("", 0);
		// TODO Auto-generated constructor stub
	}

	public Tank(String alias) {
		this(alias, 0);
	}

	public Tank(String alias, int age) {
		super();
		this.setAlias(alias);
		this.setAge(age);
	}

	@Override
	public void useSuperPower() {
		// TODO Auto-generated method stub
		
	}

}
