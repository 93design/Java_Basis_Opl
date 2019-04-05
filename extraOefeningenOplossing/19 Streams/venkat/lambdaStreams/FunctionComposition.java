package lambdaStreams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bext on 20/02/2017.
 * Streams as abstraction
 * Non mutating Pipeline
 * Revisiting Stream Operations
 *  - filter
 *  - map
 *  - reduce
 *  - specialized reduces
 *  - sum
 * -collect
 *  - to list
 *  - to set
 *  - to map
 * - groupingBy
 * - groupingBy and mapping
 * - Efficiency of Streams
 * - Lazy evaluations
 * - characteristics fo a stream: sized, ordered, distinct, sorted
 * - infinite streams
 *
 *   filter: 0 <= number of elements in the output <= number of inputs
 *   input: Stream<T> filter takes Predicate<T>
 *
 *   map: transform values
 *   number of outputs == number of inputs
 *   no guarantee  on the type of the output with respect to the type of the input
 *   parameter: Stream<T> map takes Function<T,R> to return Stream<R>
 *
 *   both filter and map stay within their swimlanes
 *   map reduce cuts across the swinlanes
 *
 *          filter      map
 *
 *   x1         /
 *   ---------------------------
 *   x2        ->        x2'
 *   ---------------------------
 *   x3         /
 *   ---------------------------
 *   x4        ->        x4'
 *   ---------------------------
 *
 *  reduce on Stream<T> takes to parameters:
 *  first parameter is  of type T
 *  second parameter is of type Bifunction<T,R,R> to produce a result of R
 */
public class FunctionComposition {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // given the values, double the even numbers and total
        // like spagetti code
        int result = 0;
        for (int e : numbers)
            if (e % 2 == 0)
                result += e * 2;

        System.out.println(result);

        // with stream
        // Function Composition: stream -> filter -> mapToInt -> sum
        System.out.println(
        numbers.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
                //.reduce(0,Integer::sum)
                .sum()
        );

        // something more complex
        TimeIt.code(new Runnable() {
            public void run() {
               System.out.println( numbers.stream().count()
               );
            }
        });

        /*
        TimeIt.code(() ->
            System.out.println(
              numbers.stream()
                    .filter( e -> e % 2 == 0)
                    //.mapToInt(e -> compute(e))
                    .mapToInt(FunctionComposition::compute)
                    .sum()
            )
        );  // Time taken: 3.007894...
*/
        /*
        // something more complex  PARALLEL STREAM
        TimeIt.code(() ->
                System.out.println(
                        numbers.parallelStream()
                                .filter( e -> e % 2 == 0)
                                //.mapToInt(e -> compute(e))
                                .mapToInt(FunctionComposition::compute)
                                .sum()
                )
        );   // Time taken: 0.565780...
        */

        System.out.println(
          numbers.stream()
                .filter( e -> e % 2 == 0)
                .map( e -> e * 2.0)
                .reduce(0.0 , (curry, e) -> curry + e)
        );

        // comverting a little
        System.out.println(
                numbers.stream()
                        .filter( e -> e % 2 == 0)
                        .mapToDouble( e -> e * 2.0)
                        .sum()
        );
    }

    static public int compute(Integer e) {
        //assume this is time intensive
        try { Thread.sleep(500); } catch(InterruptedException ex) {}
        return e * 2;
    }
}
