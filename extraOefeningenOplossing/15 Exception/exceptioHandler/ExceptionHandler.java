package exceptioHandler;

import java.util.Scanner;

public class ExceptionHandler {
    public static void main (String[] args) {

        Scanner kbd = new Scanner(System.in);

        try {
//            kbd.close();
            int numerator = Integer.parseInt(kbd.next());
            int denominator = Integer.parseInt(kbd.next());
            int division = numerator / denominator;
            System.out.println(numerator + "/" + denominator + "= "
                    + division);
        }catch (NumberFormatException ex) {
            System.out.println("Invalid number!");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
//        } catch (IllegalStateException ex) {
//            System.out.println("Sorry machine is broken.");
//        }

    }

}
