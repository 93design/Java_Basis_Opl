 package org.rastalion.chapter19_streaming_api.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonApp {
    private static List<Person> people = new ArrayList<>();

    //Method that consumes some arguments and makes a Person Obj
    private static void humanFactory (String name, String surname,
                                      String adress) {
        people.add(new Person(name,
                surname, adress));
    }

    public static void main (String[] args) {

        //Some Strings that are shared if for example no adress is -	   stated we can use a â€œdefaultâ€� String
        String beSmart = "default";
        String name = "Alex";
        String surname = "Keisse";
        Optional<Person> optionalPerson;

        //Make a humanFactory Method
        humanFactory(name, surname, "Watervliet");
        humanFactory("Bart", "Hunerbein", "koekoekstraat");
        humanFactory("Wouter", "Van den Berge", beSmart);
        humanFactory("Patrick", "Geudens", beSmart);
        humanFactory("Philip", "Decoster", "lalaLand");
        humanFactory("Omer", "Oempaloempa", beSmart);
        humanFactory("Hunney", "Buubuu", "Texas, yup texas...");

        //Make an instance of our Util class
        GatherAllThePersons persons = new GatherAllThePersons();

        //Set the list in our util Class
        persons.sacrificePerson(people);

        //We use our person object to retrieve the list of People and
        //print the users that come throught the stream
        persons.getPeople().stream().forEach(System.out::println);

        //Make OptionalPerson field and search for a Person using
        //2 Strings name && surname
        optionalPerson = persons.getPersonFromSlavery(name, surname);

        //use the optional person to free a slave
        persons.freeSlave(optionalPerson);

        //Reprint our persons list now again using a Stream.
        System.out.println("Second");
        persons.getPeople().stream().forEach(System.out::println);
    }

}
