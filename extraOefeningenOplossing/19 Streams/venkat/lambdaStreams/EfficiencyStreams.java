package lambdaStreams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bext on 21/02/2017.
 */
public class EfficiencyStreams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList( 1,2,3,5,4,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        // given  an ordered list find the double of the first even number greather than 3.
        int result = 0;
        for (int e: numbers) {
            //System.out.println(e);
            if (e > 3 && e % 2 == 0) {
                result = e * 2;
                break;
            }
        }
        System.out.println(result);

        numbers.stream()
                .filter(e -> e > 3)
                .filter(e -> e % 2 == 0)
                .map(e ->  e * 2)
                .findFirst();

        numbers.stream()
                .filter(EfficiencyStreams::isGTH3)
                .filter(EfficiencyStreams::isEven)
                .map(EfficiencyStreams::doubleIt)
                .findFirst();

    }

    public static boolean isGTH3(int e) {
        System.out.println("isGTH3 " + e);
         return e > 3;
    }

    public static boolean isEven(int e) {
        System.out.println("isEven " + e);
        return e % 2 == 0;
    }

    public static int doubleIt( int e) {
        System.out.println("doubleIT " + e);
        return e * 2;
    }
}
