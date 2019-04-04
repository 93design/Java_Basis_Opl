package lambda_02;
public class TextApp {
   public static void main(String[] args) {
      TextPrinter tp = new TextPrinter(
         "Hello this is an example of a sentence containing words");
      // Static methods
      tp.printProcessedWords(s -> String.format("<<%s>>", s));
      tp.printProcessedWords(s -> TextUtil.quote(s));
      tp.printProcessedWords(TextUtil::quote);
      tp.printProcessedWords(s -> TextUtil.reverse(s));
      tp.printProcessedWords(TextUtil::reverse);
      // Non static bound methods
      TextPadder padder = new TextPadder(20);
      tp.printProcessedWords(s -> padder.pad(s));
      tp.printProcessedWords(padder::pad);
      TextScrambler scrambler = new TextScrambler();
      tp.printProcessedWords(scrambler::scramble);
      // Non static unbound methods
      tp.printProcessedWords(s -> s.toLowerCase());
      tp.printProcessedWords(String::toLowerCase);
      // Constructor reference
      tp = new TextPrinter("145 236 9852 3658");
      tp.printNumberValues(s -> new Double(s));
      tp.printNumberValues(Double::new);
      tp.printSum(Double::new);
   }
}
