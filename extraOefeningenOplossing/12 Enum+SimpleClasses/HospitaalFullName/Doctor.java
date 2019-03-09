package HospitaalFullName;
import java.time.LocalDate;

public class Doctor extends OperationStaff{

    private String [] speciality=new String[0];

    public Doctor(Title title, String givenName, String middelName, String homAddress, Gender gender, LocalDate joined, LocalDate birthdate, Departement departement) {
        super(title, givenName, middelName, homAddress, gender, joined, birthdate,departement);

    }



}
