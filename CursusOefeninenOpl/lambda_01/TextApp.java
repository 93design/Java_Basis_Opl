package lambda_01;
public class TextApp {
   public static void main(String[] args) {
      TextPrinter tp = new TextPrinter(
         "Hello this is an example of a sentence containing words");
      
      System.out.println("*** Words containing 'e' ***");
      tp.printFilteredWords(s -> s.contains("e"));
      
      System.out.println("*** Long words ***");
      tp.printFilteredWords(s -> s.length() > 4);
      
      System.out.println("*** Words starting with 'a' ***");
      tp.printFilteredWords(s -> s.startsWith("a"));
      
      System.out.println(
         "*** Words containing 'e' on second position ***");
      tp.printFilteredWords(s -> s.indexOf('e') == 1);      
      
      WordFilter wf = s -> s.indexOf('e') ==1;
      tp.printFilteredWords(wf);
      
      System.out.println("*** Words containing 2x 'e' ***");      
      tp.printFilteredWords(s -> {
         int count = 0;
         for (char c : s.toCharArray()) {
            if (c == 'e')
               count++;
         }
         return count == 2;
      });
   }
}