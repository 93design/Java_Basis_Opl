package be.intecbrussel.basis.exercise12_01;

import java.util.*;

public class WrapperApp {

   public static void main(String[] args) {

      Scanner keyboard = new Scanner(System.in);      
      String input = keyboard.next();
      
      //Integer value = Integer.valueOf(input);
      Integer value = new Integer(input);
      int intValue = Integer.parseInt(input);
      
      System.out.println(value);
      System.out.println(intValue);

      
      value += 5;

      System.out.println(value);
      
      System.out.println("Integer number of bytes: " + Integer.BYTES);
      System.out.println("Integer number of bits: " + Integer.SIZE);
      
      keyboard.close();

   }
}
