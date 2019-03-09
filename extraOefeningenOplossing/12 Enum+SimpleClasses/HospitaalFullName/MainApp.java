package HospitaalFullName;
import java.time.LocalDate;
import java.time.Period;

public class MainApp {

    public static void main(String[] args) {

        //Zwangere vrouw
        PregnantWomen fien =new PregnantWomen(Title.MVR,"Dobbelaere","Magda","bouwerstraat",Gender.WOMEN,BloodType.AB,
                LocalDate.of(1995,6,5),
                LocalDate.of(2019,3,1),Departement.GYNOCOLOGY,LocalDate.of(2019,6,1));

        fien.getDaysToBirth();

        //Gynocoloog Marcel
        Gynocologist marcel = new Gynocologist(Title.Dr,"Depauw","Julien Marcel","destroyer street",Gender.MAN,
                LocalDate.of(1993,8,19),LocalDate.of(1993,8,19),Departement.GYNOCOLOGY);

        System.out.println("\nMarcel:");
        marcel.getWorkDays();
        marcel.getWorkYears();
        marcel.getPensionDate();
        System.out.println();

        //Stomatoloog Alexis
        StomachSurgeron alexis = new StomachSurgeron(Title.Dr,"Claeys","Alexis Chris","naast de hoek",Gender.WOMEN,
                LocalDate.of(2019,2,13),LocalDate.of(2019,2,13),Departement.PODOLOGY);

        System.out.println("\nAlexis");
        alexis.getWorkDays();
        alexis.getWorkYears();
        alexis.getPensionDate();
        System.out.println();

        //Receptionist Margaritte
        Receptionist margaritte = new Receptionist(Title.MVR,"VanSteenkiste","Margaritte Odette","Kisten straat 30",Gender.WOMEN,
                LocalDate.of(1977,3,9),LocalDate.of(1977,3,9),Departement.RADIOLOGY);

        System.out.println("\nMargaritte");
        margaritte.getPensionDate();
        System.out.println();
        System.out.println("Margaritte moet nog "+margaritte.getPensionDays()+" dagen werken voor haar pensioen");



    }

}
