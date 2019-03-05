package bigPersonUML;

public abstract class Pet {
	private String name;
	private int age;
	private double weight;
	protected double realAge;
	
	
	public Pet(String name, int age, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public abstract void beCute();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getRealAge() {
		return realAge;
	}

	public void setRealAge(double realAge) {
		this.realAge = realAge;
	}
	
	
	
	
	
	
	
	

}
