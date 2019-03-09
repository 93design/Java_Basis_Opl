package PatientEnum;

public class Person {

	private String name;
	private int age;
	private double weigth;
	private Gender gender;
	
	public Person(String name, int age, double weigth, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.weigth = weigth;
		this.gender = gender;
	}	
	
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
	public double getWeigth() {
		return weigth;
	}
	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
	
	
	
}
