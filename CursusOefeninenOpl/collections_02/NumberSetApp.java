package collections.collections_02;

import java.util.*;

public class NumberSetApp {

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter numbers (stop with 0):");
      Set<Integer> numbers = new HashSet<Integer>();
      int number = 0;
      while((number=scanner.nextInt()) != 0) {
         numbers.add(number);
      }
      int sum = 0;
      for(int n : numbers) {
         System.out.println(n);
         sum+= n;
      }
      
      System.out.println("Sum : " + sum);
      System.out.println("Avg : " + sum/numbers.size());
      
      //Integer[] na = numbers.toArray(new Integer[numbers.size()]);
      Integer[] na = numbers.toArray(new Integer[0]);
      
      for(int i: na) {
         System.out.println(i);
      }
      
      scanner.close();
            
      
   }
}
