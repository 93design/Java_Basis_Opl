package bigPersonUML;

import java.util.Arrays;

import HeroOefening.Hero;

public abstract class Person {

	private int weigth;
	private int age;
	private static int count;
	private House house;
	private Pet[] pets;
	private Hobby[] hobbies;
	
	public Person() {
		this.hobbies = new Hobby[0];
		this.pets = new Pet[0];
		count++;
	}
	
	public abstract void showMyHobbies();

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public Pet[] getPets() {
		return pets;
	}

	public void setPets(Pet[] pets) {
		this.pets = pets;
	}

	public Hobby[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(Hobby[] hobbies) {
		this.hobbies = hobbies;
	}

	public House getHouse() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void addHobby(Hobby hobby) {
		hobbies = Arrays.copyOf(hobbies, hobbies.length +1);
		hobbies[hobbies.length-1] = hobby;
	}
	
	public void addPet(Pet pet) {
		pets = Arrays.copyOf(pets, pets.length +1);
		pets[pets.length-1] = pet;
	}
	
	
}
