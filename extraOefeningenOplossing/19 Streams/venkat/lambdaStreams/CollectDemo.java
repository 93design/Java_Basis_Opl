package lambdaStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Collectors.*;

/**
 * Created by Bext on 21/02/2017.
 */
public class CollectDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,1,2,3,4,5);

        //double the even values and put that into a list

        //Wrong way to do this
        List<Integer> doubleOfEven = new ArrayList<>();

        numbers.stream()
                .filter(e-> e % 2 == 0)
                .map(e -> e * 2)
                .forEach(e -> doubleOfEven.add(e)); //Dont do this
        //mutability is OK, sharing is nice, shared mutability is devils work
        //because troubles in parallel processing
        //friends don't let friends do shared mutation
        System.out.println(doubleOfEven);

        // use collect(Collectors...  is the safe way
        List<Integer> doubleOfEven2 =
                numbers.stream()
                .filter( e -> e % 2 == 0)
                .map( e -> e * 2)
                .collect(Collectors.toList());
        System.out.println(doubleOfEven2);

        Set<Integer> setDoubleOfEven =
                numbers.stream()
                .filter(e -> e % 2 == 0)
                .map( e -> e * 2)
                .collect(Collectors.toSet());
        System.out.println(setDoubleOfEven);
    }
}
