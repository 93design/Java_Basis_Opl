package be.intecbrussel.basis.exercise14_01;

public class Musician {
   public class Instrument {
      public void makeNoice() {
         System.out.println("plong");
      }
   }
   
   public void play() {
      System.out.println("Playing the piano");
      Instrument piano = new Instrument();
      piano.makeNoice();
   } 
}
