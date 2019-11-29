package HeroOefeningInDeKlas;

public class ArmoredHero extends Hero {
	
	public ArmoredHero() {
		this("", 0);
	}
	
	public ArmoredHero(String alias) {
		this(alias, 0);
	}
	
	public ArmoredHero(String alias, int age) {
		super();
		setAlias(alias);
		setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println("Used big ass Shield, attack deflected");
	}

	@Override
	public String toString() {
		return "ArmoredHero [Alias=" + getAlias() + ", Age=" + getAge() + "]";
	}
	
	

}
