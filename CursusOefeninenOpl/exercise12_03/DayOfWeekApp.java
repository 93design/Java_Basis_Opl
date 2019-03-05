package be.intecbrussel.basis.exercise12_03;
import java.time.*;
import java.util.*;

public class DayOfWeekApp {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter day of week [1-7]:");
      int day = keyboard.nextInt();
      System.out.println("Enter days to add:");
      int add = keyboard.nextInt();
      DayOfWeek day1 = DayOfWeek.of(day);
      DayOfWeek day2 = day1.plus(add);
      System.out.println(day1);
      System.out.println(day2);
      keyboard.close();
   }
}
