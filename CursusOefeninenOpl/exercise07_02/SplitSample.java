package be.intecbrussel.basis.exercise07_02;

public class SplitSample {
   public static void main(String[] args) {
      String text = "I just want to say hello!";
      String[] words = text.split(" ");
      for(String word: words) {
         System.out.println(word);
      }      
   }
}
