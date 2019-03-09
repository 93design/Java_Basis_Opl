package HospitaalFullName;
import java.time.LocalDate;
import java.time.Period;

public class Patient extends Person{

    public double id;
    protected BloodType bloodType;
    protected LocalDate birthDate;
    private int age;
    private String [] prescriptions;
    public LocalDate DateOfAddmission;
    private Departement departement;

    public Patient(Title title, String givenName, String middelName, String homAddress, Gender gender, BloodType bloodType, LocalDate birthDate, LocalDate dateOfAddmission, Departement departement) {
        super(title, givenName, middelName, homAddress, gender);
        this.id ++;
        this.bloodType = bloodType;
        this.birthDate = birthDate;
        DateOfAddmission = dateOfAddmission;
        this.departement = departement;
    }

    public void calculateAge(){
        age=Period.between(birthDate, LocalDate.now()).getYears();
        System.out.println("Leeftijd: "+age);
    }
}
