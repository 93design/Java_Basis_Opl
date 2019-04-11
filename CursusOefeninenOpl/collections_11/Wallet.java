package collections.collections_11;

import java.util.*;

public class Wallet {
   public static void main(String[] args) {
      Map<Coin,Integer> wallet = new HashMap<>();
      
      wallet.put(Coin.ONE_EURO, 7);
      wallet.put(Coin.TWO_EURO, 1);
      wallet.put(Coin.ONE_CENT, 2);
      wallet.put(Coin.TWO_CENT, 3);
      wallet.put(Coin.FIVE_CENT, 8);
      wallet.put(Coin.TEN_CENT, 1);
      wallet.put(Coin.TWENTY_CENT, 0);
      wallet.put(Coin.FIFTY_CENT, 9);

      wallet.forEach((c,v) -> System.out.format("%s : %d%n",c,v));


      int sum = wallet.entrySet()
                      .stream()
                      .mapToInt( e -> e.getKey().getValue() * e.getValue())
                      .sum();
      
      System.out.println((sum/100F) + " € ");

      wallet.entrySet()
            .stream()
            .sorted(Map.Entry.comparingByKey())
            .forEach((e) -> System.out.format("%s : %d%n",e.getKey(),e.getValue()));
   }
}
