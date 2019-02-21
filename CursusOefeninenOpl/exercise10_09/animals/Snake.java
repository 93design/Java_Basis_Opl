package be.intecbrussel.basis.exercise10_09.animals;

public class Snake extends Animal {

   @Override
   public void move() {
      System.out.println("Gliding");
   }

   public Snake() {
   }

   public Snake(String name) {
      super(name);
   }

   @Override
   public void makeNoise() {
      System.out.println("Sssssss");
   }
}
