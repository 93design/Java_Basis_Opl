package lambda_03;

public interface TextUtil {
   
   public static String quote(String s) {
      return String.format("<<%s>>",s);
   }
      
   public static String reverse(String s) {
      return new StringBuilder(s).reverse().toString();
   }   
}
