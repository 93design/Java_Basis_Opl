package HospitaalFullName;
import java.time.LocalDate;

public class Gynocologist extends Doctor {

    public Gynocologist(Title title, String givenName, String middelName, String homAddress, Gender gender, LocalDate joined, LocalDate birthdate, Departement departement) {
        super(title, givenName, middelName, homAddress, gender, joined, birthdate, departement);
    }
}
