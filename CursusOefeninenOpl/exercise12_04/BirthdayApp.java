package be.intecbrussel.basis.exercise12_04;

import java.time.LocalDate;

public class BirthdayApp {

    public static void main (String[] args) {

        LocalDate birthday = LocalDate.of(1989, 3, 16);

        System.out.println("Day of year: " + birthday.getDayOfYear());
        System.out.println("Day of month: " + birthday.getDayOfMonth());
        System.out.println("Month of year: " + birthday.getMonth());
        System.out.println("Day of week: " + birthday.getDayOfWeek());
        System.out.println("Leap year: " + birthday.isLeapYear());

        System.out.println(birthday);


    }
}
