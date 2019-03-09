package HospitaalFullName;
import java.time.LocalDate;

public class AppendixPatient extends Patient {

    public AppendixPatient(Title title, String givenName, String middelName, String homAddress, Gender gender, BloodType bloodType, LocalDate birthDate, LocalDate dateOfAddmission, Departement departement) {
        super(title, givenName, middelName, homAddress, gender, bloodType, birthDate, dateOfAddmission, departement);
    }
}
