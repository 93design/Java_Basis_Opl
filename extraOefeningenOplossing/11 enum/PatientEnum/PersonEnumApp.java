package PatientEnum;

public class PersonEnumApp {

	public static void main(String[] args) {
		Person person1 = new Person("Atilla", 30,80, Gender.MAN);		
		Person patient1 = new Patient("jamie", 25,85,Gender.MAN, BloodType.O);
		
		System.out.println(person1);
		System.out.println(patient1);
	}	
}