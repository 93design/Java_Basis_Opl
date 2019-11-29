package HeroOefeningInDeKlas;

public class Engergizer extends Hero {

	
	public Engergizer() {
		this("", 0);
	}
	
	public Engergizer(String alias) {
		this(alias, 0);
	}
	
	public Engergizer(String alias, int age) {
		super();
		setAlias(alias);
		setAge(age);
	}
	
	@Override
	public void useSuperPower() {
		System.out.println("Spreading that Poooowaaah");
		
	}

	@Override
	public String toString() {
		return "Engergizer [alias= " + getAlias() + ", Age= " + getAge() + "]";
	}
	
	

}
