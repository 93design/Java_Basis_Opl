package be.intecbrussel.basis.exercise11_01;
public enum Coin {

   ONE_CENT(1),
   TWO_CENTS(2),
   FIVE_CENTS(5),
   TEN_CENTS(10),
   TWENTY_CENTS(20),
   FIFTY_CENTS(50),
   ONE_EUR(100),
   TWO_EURO(200);
   
   private int value = 0;

   private Coin(int value) {
      this.value = value;
   }

   public int getValue() {
      return value;
   }

}