package PatientEnum;

public class Patient extends Person {

	private BloodType blood;
	
	
	public Patient(String name, int age, double weigth, Gender gender) {
		super(name, age, weigth, gender);
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String name, int age, double weigth, Gender gender, BloodType blood) {
		super(name, age, weigth, gender);
		this.blood = blood;
	}

	public BloodType getBlood() {
		return blood;
	}

	public void setBlood(BloodType blood) {
		this.blood = blood;
	}

	@Override
	public String toString() {
		return "Patient [blood=" + blood + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getWeigth()="
				+ getWeigth() + ", getGender()=" + getGender() + "]";
	}
	
	
	
	
	

}
