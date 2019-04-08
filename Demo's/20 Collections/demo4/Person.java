package org.rastalion.chapter20_collections.demo4;

public class Person {

    private String name;
    private String surname;

    private int age;
    private int weight;
    private int length;

    public Person () {
        this("","",0,0,0);
    }

    public Person (String name, String surname,
                   int age, int weight, int length) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.length = length;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (weight != person.weight) return false;
        if (length != person.length) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        return surname != null ? surname.equals(person.surname) : person.surname == null;
    }

    @Override
    public int hashCode () {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (surname != null ? surname.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + weight;
        result = 31 * result + length;
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", length=" + length +
                '}';
    }
}
