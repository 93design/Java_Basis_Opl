package exercise06_03;

public class StringSamples {
   public static void main(String[] args) {
      String text = "Hello World";
      System.out.println(text.length());
      System.out.println(text.toUpperCase());
      System.out.println(text.indexOf("World"));      
      System.out.println(text.compareTo("Hello Mars")); 
      
      char c = text.charAt(4);
      System.out.println(c);
      
      int pos = text.indexOf('l');
      System.out.println(pos); // 2
      int pos2 = text.indexOf('l',pos +1);
      System.out.println(pos2); // 3
      int pos3 = text.indexOf('l',pos2 +1);
      System.out.println(pos3); // 9
      
   }
}
