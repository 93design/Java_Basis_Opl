package be.intecbrussel.basis.exercise07_05;
public class StatisticsApp {
   public static void main(String[] args) {
      System.out.println(Statistics.average());      
      System.out.println(Statistics.average(4, 7, 9));
      System.out.println(Statistics.average(7, 9, 2, 3, 5));
      System.out.println(Statistics.average(3, 8, 6, 9, 4, 7));
      int[] values = { 3, 8, 6, 9, 4, 7 };
      System.out.println(Statistics.average(values));
      System.out.println(Statistics.max(3, 8, 6, 9, 4, 7));
      System.out.println(Statistics.min(3, 8, 6, 9, 4, 7));
   }
}