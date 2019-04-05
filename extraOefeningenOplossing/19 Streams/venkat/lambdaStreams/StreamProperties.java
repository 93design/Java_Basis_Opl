package lambdaStreams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bext on 21/02/2017.
 */
public class StreamProperties {
    public static void main(String [] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);

        numbers.stream()
                .filter( e -> e % 2 == 0)
                .forEach(System.out::println);
        //sized, ordered,  non-disctinct,  non-sorted

        numbers.stream()
                .filter( e -> e % 2 == 0)
                .sorted()
                .distinct()
                .forEach(System.out::println);
        //sized, ordered,  disctinct,  sorted

    }
}
