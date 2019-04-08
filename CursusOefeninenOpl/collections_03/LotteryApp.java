package collections.collections_03;
import java.util.*;

public class LotteryApp {
   public static void main(String[] args) {
      final int MAX = 45;
      Set<Integer> jackpot = new LinkedHashSet<>();
      Set<Integer> draw = new LinkedHashSet<>();
      Scanner scanner = new Scanner(System.in);
      Random rand = new Random();
      do {
         draw.add(rand.nextInt(MAX) + 1);
      } while (draw.size() != 6);
      do {
         System.out.println("Enter number ");
         int number = scanner.nextInt();
         if (number < 1 || number > MAX) {
            System.out.println("Invalid");
         } else {
            if (!jackpot.add(number)) {
               System.out.println("Duplicate number!");
            }
         }
      } while (jackpot.size() < 6);
      System.out.println("Drawing: ");
      for (int n : draw) {
         System.out.println(n);
      }
      System.out.println("Jackpot: ");
      for (int n : jackpot) {
         System.out.println(n);
      }
      jackpot.retainAll(draw);
      System.out.println("Correct numbers: " + jackpot.size());
      scanner.close();
   }
}
