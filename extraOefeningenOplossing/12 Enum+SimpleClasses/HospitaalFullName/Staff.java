package HospitaalFullName;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Staff extends Person{
    private LocalDate joined;
    private LocalDate birthdate;
    private Departement departement;

    public Staff(Title title, String givenName, String middelName, String homAddress, Gender gender, LocalDate joined, LocalDate birthdate, Departement departement) {
        super(title, givenName, middelName, homAddress, gender);
        this.joined = joined;
        this.birthdate=birthdate;
        this.departement=departement;
    }

    //Methods
    public void getWorkDays(){
        System.out.println("Aantal dagen gewerkt: "+ ChronoUnit.DAYS.between(joined,LocalDate.now()));
    }
    public void getWorkYears(){
        System.out.println("Aantal jaar gewerkt: "+ ChronoUnit.YEARS.between(joined,LocalDate.now()));
    }
    public void getPensionDate(){
        System.out.format("Pensioen datum: %1$td/%1$tm/%1tY",birthdate.plusYears(42));
    }
    public int getPensionDays(){
        return Period.between(LocalDate.now(),joined.plusYears(42)).getDays();
    }
}
