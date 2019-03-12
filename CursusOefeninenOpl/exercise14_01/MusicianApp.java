package be.intecbrussel.basis.exercise14_01;

public class MusicianApp {
   
   public static void main(String[] args) {
      Musician musician = new Musician();
      musician.play();
      
      Musician.Instrument instrument = musician.new Instrument();
      instrument.makeNoice();
   }
}
