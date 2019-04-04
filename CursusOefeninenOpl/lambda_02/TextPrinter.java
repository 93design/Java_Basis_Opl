package lambda_02;

public class TextPrinter {
   private String sentence;

   public TextPrinter(String sentence) {
      this.sentence = sentence;
   }

   public void printFilteredWords(WordFilter filter) {
      for (String w : sentence.split(" ")) {
         if (filter.isValid(w)) {
            System.out.println(w);
         }
      }
   }

   public void printProcessedWords(WordProcessor processor) {
      for (String w : sentence.split(" ")) {
         System.out.println(processor.process(w));
      }
   }

   public void printNumberValues(NumberParser parser) {
      for (String w : sentence.split(" ")) {
         System.out.format("%,f%n", parser.parse(w));
      }
   }

   public void printSum(NumberParser parser) {
      double sum = 0;
      for (String w : sentence.split(" ")) {
          sum += parser.parse(w);
      }
      System.out.format("Sum: %,f%n", sum);
  }

   public String toString() {
      return sentence;
   }
}
