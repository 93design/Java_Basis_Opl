package lambda_03;

import java.util.function.*;

public class TextPrinter {
   private String sentence;
   private Consumer<String> printer;

   public TextPrinter(String sentence) {
   	this(sentence, System.out::println);
   }

   public TextPrinter(String sentence, Consumer<String> printer) {
      this.sentence = sentence;      
      this.printer = printer;
   }

   public void printFilteredWords(Predicate<String> filter) {
      for (String w : sentence.split(" ")) {
         if (filter.test(w)) {
            printer.accept(w);
         }
      }
   }

   public void printProcessedWords(Function<String,String> processor) {
      for (String w : sentence.split(" ")) {
      	printer.accept(processor.apply(w));
      }
   }

   public void printNumberValues(Function<String,Double> parser) {
      for (String w : sentence.split(" ")) {
      	printer.accept(String.format("%,f%n", parser.apply(w)));
      }
   }

   public void printSum(Function<String,Double> parser) {
      double sum = 0;
      for (String w : sentence.split(" ")) {
          sum += parser.apply(w);
      }
      printer.accept(String.format("Sum: %,f%n", sum));
  }

   public String toString() {
      return sentence;
   }
}
