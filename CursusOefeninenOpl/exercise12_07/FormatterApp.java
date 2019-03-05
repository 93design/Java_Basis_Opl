package be.intecbrussel.basis.exercise12_07;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class FormatterApp {
   @SuppressWarnings("resource")
   public static void main(String[] args) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
         "dd/MM/yyyy");
      DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(
         "yyyy-MM-dd");
      System.out.println(
         "Enter a date in this format: DD/MM/YYYY");
      Scanner keyboard = new Scanner(System.in);
      String date = keyboard.next();
      LocalDate d = LocalDate.parse(date, formatter);
      System.out.println(formatter2.format(d));
      System.out.println(DateTimeFormatter.ISO_LOCAL_DATE.format(
         d));
   }
}
