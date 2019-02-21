package be.intecbrussel.basis.exercise10_07.animals;
public class AnimalApp {
   public static void main(String[] args) {
      Animal cat = new Cat("Tom");
      Animal fish = new Fish("Wanda");
      Animal bird = new Bird("Tweety");
      Animal snake = new Snake("Kaa");
      cat.move();
      fish.move();
      bird.move();
      snake.move();
      cat.makeNoise();
      fish.makeNoise();
      bird.makeNoise();
      snake.makeNoise();
   }
}
