package exercise05_05;

public class TempResult {
   public static void main(String[] args) {
      int number1 = 2147483645;
      int number2 = 2147483640;
      long result = ((long) number1) * number2;
      System.out.println(result);      
      System.out.println(2147483645L * 2147483640);      
   }
}
