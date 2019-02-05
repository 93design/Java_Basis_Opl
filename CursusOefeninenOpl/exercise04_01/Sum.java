package exercise04_01;
import java.util.*;

public class Sum {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);      

      System.out.println("Enter a number:");
      int a = keyboard.nextInt();
      
      System.out.println("Enter another number:");
      int b = keyboard.nextInt();

      int sum = a + b;
      
      System.out.println("The sum is " +sum); 
      
      keyboard.close();
   }
}
