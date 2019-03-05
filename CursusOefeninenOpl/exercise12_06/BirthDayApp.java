package be.intecbrussel.basis.exercise12_06;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class BirthDayApp {

   public static void main(String[] args) {

      LocalDate now = LocalDate.now();
      LocalDate birthday = LocalDate.of(1967, 5 , 2);
      Period period = Period.between(birthday,now);
      
      System.out.println("Days in period:" + period.getDays());
      System.out.println("Months in period:" + period.getMonths());
      System.out.println("Years in period:" + period.getYears());
      
      System.out.println("Total Days:" + ChronoUnit.DAYS.between(birthday, now));
      System.out.println("Total Weeks:" + ChronoUnit.WEEKS.between(birthday, now));      
      System.out.println("Total Months:" + ChronoUnit.MONTHS.between(birthday, now));
      System.out.println("Total Years:" + ChronoUnit.YEARS.between(birthday, now));
      
   }
}
