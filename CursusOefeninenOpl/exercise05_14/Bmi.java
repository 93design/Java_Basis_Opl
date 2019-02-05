package exercise05_14;
import java.util.*;

public class Bmi {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter your length (cm):");
      int length = keyboard.nextInt();
      
      System.out.println("Enter your weight (kg):");
      int weight = keyboard.nextInt();
      
      float bmi = (10000F * weight) / (length * length);
      
      System.out.println("Your BMI is: " + bmi);
      if (bmi <= 20) {
         System.out.println("Underweight");
      } else if (bmi <= 25) {
         System.out.println("OK");
      } else if (bmi <= 30) {
         System.out.println("Overweight");
      } else if (bmi <= 40) {
         System.out.println("Obesitas");
      } else {
         System.out.println("Pathological overweight");
      }
      keyboard.close();
   }
}
