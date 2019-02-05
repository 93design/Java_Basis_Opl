package exercise05_18;
public class BmiUtility {
   public static float calculateBmi(int weight, int height) {
      float bmi = weight / ((height / 100F * height / 100F));
      return bmi;
   }

   public static void printDiagnose(float bmi) {
      System.out.println("Your BMI is: " + bmi);
      if (bmi < 20) {
         System.out.println("Underweight");
      } else if (bmi < 25) {
         System.out.println("OK");
      } else if (bmi < 30) {
         System.out.println("Overweight");
      } else if (bmi < 40) {
         System.out.println("Obesitas");
      } else {
         System.out.println("Pathological overweight");
      }
   }
}
