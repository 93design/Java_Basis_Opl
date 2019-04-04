package org.rastalion.chapter19_streaming_api.demo2;

public class Person {
    private String name;
    private String surname;
    private String adress;

    //One constructor with all the fields as params
    public Person (String name, String surname, String adress) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
    }

    //We only need the getters now
    public String getName () {
        return name;
    }

    public String getSurName () {
        return surname;
    }

    public String getAdress () {
        return adress;
    }

    //Then generate the toString method
    @Override
    public String toString () {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
