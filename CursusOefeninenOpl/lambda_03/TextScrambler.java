package lambda_03;

public class TextScrambler {
   
   public String scramble(String s) {
      return s.replaceAll("a","@").replaceAll("e","€").replaceAll("l","1").replaceAll("o","0");
   }
}
