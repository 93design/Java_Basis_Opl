package exercise05_14;

import java.util.*;

public class Age {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter your age:");
      int age = keyboard.nextInt();

      if (age < 2) {
         System.out.println("You are a baby");
      } else if(age <10 ){
         System.out.println("You are a child");
      } else if(age <18 ){
         System.out.println("You are a teenager");
      } else {
         System.out.println("You are an adult");
      }
      keyboard.close();
   }
}
