package bigPersonUML;

public class Cat extends Pet {

	public Cat(String name, int age, double weight) {
		super(name, age, weight);
		// TODO Auto-generated constructor stub
	}

	public void calculateRealAge() {
		this.realAge = this.getAge() * 7;
	}

	
	@Override
	public void beCute() {
		System.out.println("Only having one eye");
	}

	@Override
	public String toString() {
		return "Cat [realAge=" + realAge + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getWeight()="
				+ getWeight() + "]";
	}

	
	
}
