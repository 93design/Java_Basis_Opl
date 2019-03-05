package be.intecbrussel.basis.exercise13_03;

public class PigApp {
   public static void main(String[] args) {      
      //Pig pig = Pig.createPig();
      Pig pig = new MyPig();
      //Pig pig = new StrangePig();
      pig.grunt();
      pig.fly();
   }
}
