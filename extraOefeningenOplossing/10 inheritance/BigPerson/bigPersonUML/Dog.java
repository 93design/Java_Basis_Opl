package bigPersonUML;

public class Dog extends Pet {

	

	public Dog(String name, int age, double weight) {
		super(name, age, weight);
	}

	public void calculateRealAge() {
		this.realAge = this.getAge() * 7;
	}

	@Override
	public void beCute() {
			System.out.println("being sleepy as fuxk all the time");		
	}

	@Override
	public String toString() {
		return "Dog [realAge=" + realAge + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getWeight()="
				+ getWeight() + ", getRealAge()=" + getRealAge() + "]";
	}
	
	
}
