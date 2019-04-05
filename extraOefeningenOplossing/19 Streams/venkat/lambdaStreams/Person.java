package lambdaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Bext on 21/02/2017.
 */
public class Person {
    enum Sex { MALE, FEMALE};

    private String name;
    private Sex gender;
    private int age;

    public Person(String name, Sex gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public  int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender + ", Age=" + age +
                '}';
    }
}
