package exercise05_15;

import java.util.*;

public class DaysInMonthOptimized {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter month (1-12):");
      int month = keyboard.nextInt();
      int days = 0;

      switch (month) {
         default: days = 0;
         case 2: days = 28;  break;
         case 4: 
         case 6: 
         case 9: 
         case 11: days = 30; break;
         case 1:
         case 3:
         case 5: 
         case 7: 
         case 8: 
         case 10: 
         case 12: days = 31; break;
      }

      if (days == 0) {
         System.out.println("Invalid month!");
      } else {
         System.out.println("Number of days: " + days);
      }
      keyboard.close();
   }
}