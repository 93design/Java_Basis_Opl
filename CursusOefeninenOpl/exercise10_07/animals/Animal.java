package be.intecbrussel.basis.exercise10_07.animals;

public abstract class Animal {
   private String name;

   public Animal() {
      
   }
   
   public Animal(String name) {
      this.name= name;
   }
   
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   public abstract void move();
   public abstract void makeNoise();
}
