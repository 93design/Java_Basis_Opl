package exercise05_16;

public class While3 {
   public static void main(String[] args) {
      int power = 1;   
      do {
         System.out.println(power);
         power*=5;
      }while(power < 10000);
   }
}