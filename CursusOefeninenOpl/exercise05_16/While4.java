package exercise05_16;

public class While4 {
   public static void main(String[] args) {
      char character = 'A';
      do {
         System.out.println(character++);
      }
      while (character <= 'Z');
   }
}