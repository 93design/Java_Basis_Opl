package lambdaStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Bext on 20/02/2017.
 */
public class InternalIterator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //stream forEach con Consumer accept

        numbers.forEach(new Consumer<Integer>() {
                    public void accept(Integer value) {
                        System.out.println(value);
                    }
                });

        // eliminating de noise code

        numbers.forEach((Integer value) -> System.out.println(value));


        // eliminating more noise
        //java 8 has type inference, but only for lambda expressions
        numbers.forEach((value) -> System.out.println(value));
        // elimintaing more noise code, elimintate parentesis only when one parameter
        numbers.forEach(value -> System.out.println(value));
        // processing a litle more the value
        numbers.forEach(value -> System.out.println(value * 1));
        numbers.forEach(value -> System.out.println(value - 2));

        //numbers.stream().forEach(System.out.println());   //error

        // Method Reference Syntax  receive de parameter and passing the parameter
        numbers.forEach(System.out::println);

/*      // While lambdas are really cute, keep them that way.
        numbers.stream().forEach( e -> {
            some code;
            some code;
            some code;
            return.... may be needed...
        });
*/
        numbers.forEach(e -> { System.out.print(e);
            System.out.println(" en otro renglon lambda");
        });
    }
}
