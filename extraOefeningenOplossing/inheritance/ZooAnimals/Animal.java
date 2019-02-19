package ZooOefening;

public abstract class Animal {
	
	private String name;
	private double weight;
	private int age;
	
	public Animal() {
		this("",0,0);		
	}

	public Animal(String name, double weight, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	protected abstract void move();
	protected abstract void makeNoise();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", weight=" + weight + ", age=" + age + "]";
	}
	
	
}
