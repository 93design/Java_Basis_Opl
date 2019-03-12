package be.intecbrussel.basis.exercise14_03;
public class Musician {
   public void play() {
      System.out.println("Playing the piano");
      
//      class MyPiano implements Instrument {
//         public void makeNoise() {
//            System.out.println("plong");
//         }
//      }
//      
//      Instrument instrument = new MyPiano();
      
      Instrument instrument = new Instrument() {
         public void makeNoise() {
            System.out.println("plong");             
         }
      };
       
      instrument.makeNoise();
   }
}
