package be.intecbrussel.basis.exercise10_09.animals;

public class Cat extends Animal {

   @Override
   public void move() {
      System.out.println("Gently moving");
   }

   public Cat() {
   }

   public Cat(String name) {
      super(name);
   }

   @Override
   public void makeNoise() {
      System.out.println("Miauw");
   }
}
