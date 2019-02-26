package be.intecbrussel.basis.exercise11_01;

public class DayApp {
   public static void main(String[] args) {

       Day [] listOfDays = Day.values();


      for(Day d: listOfDays) {
         System.out.println("name :: " + d.name());
         System.out.println("ordinal :: " + d.ordinal());
         System.out.println("toString :: " + d);
      }

   }
}
