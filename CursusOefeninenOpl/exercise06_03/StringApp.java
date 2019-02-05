package exercise06_03;

import java.util.Scanner;

public class StringApp {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);         
      String text = keyboard.next();

      System.out.println(text);
      System.out.println(text.length());
      System.out.println(text.toLowerCase());
      System.out.println(text.toUpperCase());
      System.out.println(text.replace('a','o'));
      int count = 0;

      for(int i = 0; i <text.length(); i++)	{
         if(text.charAt(i) == 'e') count++;
      }
      System.out.println(count);
      
      String string1 ="Hello World";
      String string2 ="Hello Mars";
      System.out.println(string1.equals(string2));
      if(string1.compareTo(string2) < 0) {
         System.out.println(string1);
         System.out.println(string2);         
      }
      else {
         System.out.println(string2);
         System.out.println(string1);                  
      }
      
      String string3 = "    Text with whitespaces     ";
      System.out.println(string3.trim());   
      keyboard.close();
   }
}
