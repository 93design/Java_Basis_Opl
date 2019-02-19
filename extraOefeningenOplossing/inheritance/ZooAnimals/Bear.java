package ZooOefening;

public class Bear extends Animal {

	
	
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bear(String name, double weight, int age) {
		super(name, weight, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
			System.out.println("Climbining up a tree");
	}

	@Override
	protected void makeNoise() {
		System.out.println("Graaaaaaaaughwww");
		
	}

	@Override
	public String toString() {
		return "Bear [Name=" + getName() + ", Weight=" + getWeight() + ", Age=" + getAge() + "]";
	}
	
	

}
