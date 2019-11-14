package exercise07_02;

public class StringArray {
   public static void main(String[] args) {
      String[] lines = new String[5];
      lines[0] = "Hello World";
      lines[1] = "Hello Mars";
      lines[2] = "Hello Venus";
      lines[3] = "Hello Jupiter";
      lines[4] = "Hello Saturn";
      for(String line: lines) {
         System.out.println(line);
      }
   }
}
