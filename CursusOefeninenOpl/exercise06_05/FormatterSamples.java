package exercise06_05;

import java.util.*;

public class FormatterSamples {

   public static void main(String[] args) {
      Formatter formatter = new Formatter();      
      // String text = "I'm %d years old!";
      String text = "I'm %d years old and I'm %.2f m tall!";
      formatter.format(text,21,1.75);
      System.out.println(formatter);
      
      Formatter f = new Formatter();
      f.format("%b %c %d %f %s %n",true,'a',12,45.2,"hello");
      System.out.println(f.toString());
      f.close();
      formatter.close();
   }

}
