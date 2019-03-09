package HospitaalFullName;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PregnantWomen extends Patient{

    private LocalDate dateOfExpectedDelivery;

    public PregnantWomen(Title title, String givenName, String middelName, String homAddress, Gender gender, BloodType bloodType, LocalDate birthDate, LocalDate dateOfAddmission, Departement departement, LocalDate dateOfExpectedDelivery) {
        super(title, givenName, middelName, homAddress, gender, bloodType, birthDate, dateOfAddmission, departement);
        this.dateOfExpectedDelivery = dateOfExpectedDelivery;
    }

    //Methodes
    public void getDaysToBirth(){
        System.out.println("\nNog "+ ChronoUnit.DAYS.between(LocalDate.now(),dateOfExpectedDelivery) +" dagen voor de bevalling van "+getMiddelName()+" "+getGivenName());
    }
}
