package be.intecbrussel.basis.exercise11_01;
public class CoinApp {
   public static void main(String[] args) {

      Coin[] wallet = { Coin.FIFTY_CENTS, Coin.TWO_EURO,
         Coin.ONE_EUR, Coin.TEN_CENTS };

      int total = 0;

      for (Coin c : wallet) {
         total += c.getValue();
         System.out.println("Oooh I found: " + c);
      }

      System.out.println("Total amount of cent: " + total);
   }
}
