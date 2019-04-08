package collections.collections_02;
import java.util.*;

public class LotteryApp {
   public static void main(String[] args) {
      final int MAX = 45;
      Set<Integer> jackpot = new HashSet<>();
      Set<Integer> draw = new HashSet<>();
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      
      do {
         draw.add(rand.nextInt(MAX) + 1);
      } while (draw.size() != 6);
      
      do {
         System.out.println("Enter number between 0 and " + MAX);
         try {
            int number = Integer.parseInt(scanner.next());
            if (number < 1 || number > MAX) {
               System.out.println("Invalid");
            } else {
               if (!jackpot.add(number)) {
                  System.out.println("Duplicate number!");
               }
               System.out.print("Numbers :");
               jackpot.forEach(n -> System.out.format("%s ", n));
               System.out.println();
            }
         } catch (Exception e) {
            System.out.println("Invalid number!");
         }
      } while (jackpot.size() < 6);
      System.out.println("Drawing: ");
      draw.forEach(System.out::println);
      System.out.println("Jackpot: ");
      jackpot.forEach(System.out::println);
      
      jackpot.retainAll(draw);
      
      System.out.println("Correct numbers: " + jackpot.size());
      jackpot.forEach(System.out::println);
      scanner.close();
   }
}
