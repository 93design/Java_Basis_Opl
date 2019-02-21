package be.intecbrussel.basis.exercise10_07.animals;
public class Cat extends Animal {
   public Cat() {
   }

   public Cat(String name) {
      super(name);
   }

   @Override
   public void move() {
      System.out.println("Gently moving");
   }

   @Override
   public void makeNoise() {
      System.out.println("Miauw");
   }
}
