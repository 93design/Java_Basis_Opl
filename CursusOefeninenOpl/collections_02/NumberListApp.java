package collections.collections_02;

import java.util.*;

public class NumberListApp {

    public static void main (String[] args) {

      /*
      We will need a Scanner instance
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers (stop with 0):");

      /*
      Also a list to store Integers in
       */
        List<Integer> numbers = new ArrayList<Integer>();

      /*
      int for easy usage, and serves as a condition
       */
        int number;

      /*
      While our number from the user is not equal to 0 repeat loop
       */
//        while ((number = scanner.nextInt()) != 0) {
//          /*
//          In this loop we add the number to our list
//           */
//            numbers.add(number);
//        }

        for (int i = 0; i < 5; i++) {
            number = scanner.nextInt();
            numbers.add(number);
        }

      /*
      Yeaah streams boiiiii
       */


        int sum = numbers.stream()
                .mapToInt(Integer::valueOf) // of i -> i
                .sum(); // eindbewerking

        OptionalDouble avg = numbers.stream()               //Datatype hier is omdat average deze teruggeeft
                .mapToInt(Integer::valueOf) // of i -> i
                .average(); //eindbewerking


        System.out.println("Sum : " + sum);

        //Wanneer we werken met een Optional moeten we kijken of deze een inhoud heeft
        System.out.println("Avg : " + (avg.isPresent() ? avg.getAsDouble() : ""));

        /*
        Interne iteratie
         */
        numbers.forEach(System.out::println);

        //Close the resource
        scanner.close();
    }
}
