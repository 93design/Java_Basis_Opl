package HeroOefeningInDeKlas;

public class Magician extends Hero {
	
	public Magician() {
		this("", 0);
	}
	
	public Magician(String alias) {
		this(alias, 0);
	}
	
	public Magician(String alias, int age) {
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
		return "Magician [Alias=" + getAlias() + ", Age=" + getAge() + "]";
	}
	
	

}
