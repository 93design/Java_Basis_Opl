package generics_02;
import java.util.*;

public class NumberDuoApp {
   public static void main(String[] args) {
      NumberDuo<Integer> nd1 = new NumberDuo<>(3, 5);
      NumberDuo<Double> nd2 = new NumberDuo<>(3.2, 5.8);
      NumberDuo<Number> nd3 = new NumberDuo<>(3.2, 5);
      System.out.println(nd1.getSum());
      System.out.println(nd2.getSum());
      System.out.println(nd3.getSum());
      Random rand = new Random();
      int choice = rand.nextInt(3);
      NumberDuo<?> nd4 = null;
      switch (choice) {
      case 0:
         nd4 = new NumberDuo<>(3, 5);
         break;
      case 1:
         nd4 = new NumberDuo<>(3.5F, 5.8F);
         break;
      case 2:
         nd4 = new NumberDuo<>((short) 3, (short) 4);
         break;
      }
      Number n = nd4.getFirst(); // OK
      //nd4.setFirst(new Float(6)); // error!!
   }
}
