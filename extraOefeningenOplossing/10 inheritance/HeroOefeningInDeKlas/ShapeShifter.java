package HeroOefeningInDeKlas;

public class ShapeShifter extends Hero{
	
	public ShapeShifter() {
		this("", 0);
	}
	
	public ShapeShifter(String alias) {
		this(alias, 0);
	}
	
	public ShapeShifter(String alias, int age) {
		super();
		setAlias(alias);
		setAge(age);
	}

	@Override
	public void useSuperPower() {
		System.out.println("Gittting Shifffftyy");
		
	}

	@Override
	public String toString() {
		return "ShapeShifter [Alias=" + getAlias() + ", Age=" + getAge() + "]";
	}
	
	

}
