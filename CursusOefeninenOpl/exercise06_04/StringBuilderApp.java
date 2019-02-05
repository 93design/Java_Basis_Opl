package exercise06_04;
public class StringBuilderApp {
   public static void main (String[] args) {
      StringBuilder text1 = new StringBuilder("This is my first line of text ");
      StringBuilder text2 = new StringBuilder("This is my second line of text ");
      System.out.println(text1);
      System.out.println(text2);
      text1.append(" and this is what I added.");
      System.out.println(text1);
      System.out.println(text2.reverse());
      for(int i = 0; i < text1.length() ;i++) {
         if(text1.charAt(i) == ' ') {
            text1.deleteCharAt(i--);
         }
      }
      System.out.println(text1);
      
      for(int i = 0; i < text2.length() ;i++) {
         if(text2.charAt(i) == 't') { 
            text2.insert(i++,'t');
         }
      }   
      System.out.println(text2);   
   }
}