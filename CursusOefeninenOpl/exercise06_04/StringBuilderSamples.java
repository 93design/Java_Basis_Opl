package exercise06_04;
public class StringBuilderSamples {
   public static void main (String[] args) {
      StringBuilder sb = new StringBuilder("Hello"); // "Hello"
      
      sb.append(" World");                           // "Hello World"
      int offset = sb.indexOf("World");                
      sb.insert(offset,"Big ");                      // "Hello Big World"
      sb.reverse();                                  // "dlroW giB olleH"
      String str = sb.toString();
      System.out.println(str.toUpperCase());         // "DLROW GIB OLLEH"     

      StringBuilder text = new StringBuilder("Hello World"); 
      text.setCharAt(4, 'a');
      System.out.println(text);

      String sub = text.substring(6, 11);
      System.out.println(sub);
      
   }
}