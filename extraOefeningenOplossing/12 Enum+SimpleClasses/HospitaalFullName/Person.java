package HospitaalFullName;
public class Person {

    public Title title;
    public String givenName;
    public String middelName;
    public String homAddress;
    public Gender gender;

    public Person(Title title, String givenName, String middelName, String homAddress, Gender gender) {
        this.title = title;
        this.givenName = givenName;
        this.middelName = middelName;
        this.homAddress = homAddress;
        this.gender = gender;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMiddelName() {
        return middelName;
    }
}
