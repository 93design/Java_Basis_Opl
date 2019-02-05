package exercise05_17;

public class For6 {
   public static void main(String[] args) {
      for (int number = -10; number <= 10; number++) {
         System.out.println(((number <= 0) ? "" : "+") + number);
      }
   }
}