package be.intecbrussel.basis.exercise07_05;
public class Statistics {
   public static int average(int... values) {
      int total = 0;
      for (int el : values) {
         total += el;
      }
      int avg = 0;
      if(values.length != 0) {
         avg = total/values.length;
      }
      return avg;
   }

   public static int min(int... values) {
      int min = 0;
      for (int el : values) {
         if(el < min) min =el;
      }
      return min;
   }

   public static int max(int... values) {
      int max = 0;
      for (int el : values) {
         if(el > max) max =el;
      }
      return max;
   }

}