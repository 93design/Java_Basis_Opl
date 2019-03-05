package ZooOefening;

public class Lion extends Animal {
	
	

	@Override
	protected void move() {
		System.out.println("Doing fuck all, all day long");
	}

	@Override
	protected void makeNoise() {
		System.out.println("Rwwwwwwwwaaaaaarw");
	}

	@Override
	public String toString() {
		return "Lion [getName()=" + getName() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	

	
	
}
