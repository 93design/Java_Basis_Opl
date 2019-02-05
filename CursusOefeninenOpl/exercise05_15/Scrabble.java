package exercise05_15;
import java.io.*;

public class Scrabble {
   public static void main(String[] args) throws IOException {
      System.out.println("Enter character:");
      char c = (char) System.in.read();
      int value;
      switch (c) {
      case 'a':
      case 'e':
      case 'n':
      case 'i':
      case 'o':
         value = 1;
         break;
      case 'd':
      case 'r':
      case 's':
      case 't':
         value = 2;
         break;
      case 'g':
      case 'k':
      case 'l':
      case 'm':
      case 'b':
      case 'p':
         value = 3;
         break;
      case 'u':
      case 'f':
      case 'h':
      case 'j':
      case 'v':
      case 'z':
         value = 4;
         break;
      case 'c':
      case 'w':
         value = 5;
         break;
      case 'x':
      case 'y':
         value = 8;
         break;
      case 'q':
         value = 10;
         break;
      default:
         value = 0;
      }
      System.out.println("Scrabble value: " + value);
   }
}