package ZooOktober;

public class Animal {
	
	private String name; 
	private int age;
	private double weight;
	private String breed;
	
	
	public Animal() {
		this("",0,0,"");
	}
	
	public Animal(String name, int a, double w, String b) {		
		this.name = name;
		this.age = a;
		this.weight = w;
		this.breed = b;
	}
	
	public int getAge() {
		return this.age;
	}
	
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

	public String getGender() {
		return breed;
	}
 
	public void setBreed(String breed) {
		this.breed = breed;
	}

	
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name: " + name + ", age=" + age + ", weight=" + weight + ", breed=" + breed + "]";
	} 
	
	
	
}
