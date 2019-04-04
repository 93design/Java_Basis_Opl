package org.rastalion.chapter19_streaming_api.demo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by Mrrobot on 21/11/2017 streams demo.

 This is a util class that makes use of the class People.
 We are having a List (ArrayList) and we will put people
 in and take them out. convert the list in to streams so we can
 do this with ease
 */
public class GatherAllThePersons {

    //Field people => ArrayList
    List<Person> people;

    //Constructor empty param list that instantiates the arrayList
    public GatherAllThePersons () {
        people = new ArrayList<>();
    }

    //Getter for the List
    public List<Person> getPeople () {
        return people;
    }

    //Setter of our field people that takes a list as param
    public void sacrificePerson (List<Person> people) {
        this.people = people;
    }

    //Special method that converts our list to stream and then filters
    //out the person we need if there is anyone who matches our filter query
    public Optional<Person> getPersonFromSlavery (String name, String   									   surname) {
        Stream<Person> personStream = people.stream()
                .filter(person -> name.equals(person.getName()) &&
                        surname.equalsIgnoreCase(person.getSurName()));

        return personStream.findFirst();
    }

    //Method that takes an Optional person and checks if != null
    //if that condition is true the Person instance will be removed.
    public void freeSlave (Optional<Person> p) {
        Person temp = p.get();
        if (temp != null) {
            people.remove(temp);
        }
    }

}
