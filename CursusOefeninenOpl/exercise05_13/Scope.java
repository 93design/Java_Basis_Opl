package exercise05_13;
public class Scope {
   public static void main(String[] args) {
      // int a = 6;
      {
         int a = 6;
         System.out.println(a);
      }
      {
         int a = 8;
         System.out.println(a);
      }
      // System.out.println(a);
   }
}