package exercise05_10;

public class HomeAutomation {
   public static void main(String[] args) {
      int heating = 0;
      final int HALL = 0x01; // 00000001
      final int LIVINGROOM = 0x02; // 00000010
      final int KITCHEN = 0x04; // 00000100
      final int VERANDAH = 0x08; // 00001000
      final int BEDROOM = 0x10; // 00010000
      final int BATHROOM = 0x40; // 01000000
      final int DOWNSTAIRS = HALL | LIVINGROOM | KITCHEN | VERANDAH;
      final int UPSTAIRS = BEDROOM | BATHROOM;

      heating = heating | LIVINGROOM;
      System.out
            .println("Heating in living room on: heating = heating | LIVING \t\t("
                  + heating + ")");
      heating &= ~LIVINGROOM;
      System.out
            .println("Heating in living off: heating = heating & ~LIVING \t\t("
                  + heating + ")");
      heating |= DOWNSTAIRS;
      System.out
            .println("Heating downstairs on: heating = heating | DOWNSTAIRS \t\t("
                  + heating + ")");
      heating |= UPSTAIRS;
      System.out
            .println("Heating upstairs on: heating = heating | UPSTAIRS   \t\t("
                  + heating + ")");
      heating ^= DOWNSTAIRS;
      System.out
            .println("Heating downstairs switched: heating = heating ^ DOWNSTAIRS \t("
                  + heating + ")");
      System.out
            .println("Check heating in bathroom: (heating & BATHROOM)==BATHROOM\t\t("
                  + ((heating & BATHROOM) == BATHROOM) + ")");
      heating &= ~UPSTAIRS;
      System.out
            .println("Heating upstairs off: heating = heating & ~UPSTAIRS  \t\t("
                  + heating + ")");
   }
}
