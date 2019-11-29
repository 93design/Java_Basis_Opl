package HeroOefeningInDeKlas;


public class Tank extends Hero {
	
	public Tank() {
		this("", 0);
	}
	
	public Tank(String alias) {
		this(alias, 0);
	}
	
	public Tank(String alias, int age) {
		super();
		setAlias(alias);
		setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println("taking damage like a Mofo");

	}

	@Override
	public String toString() {
		return "Tank [ Alias= " + getAlias() + ", age= " + getAge() + "]";
	}
	
	
	

}
