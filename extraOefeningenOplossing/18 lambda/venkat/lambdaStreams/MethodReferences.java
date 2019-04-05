package lambdaStreams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Bext on 20/02/2017.
 *   Method Reference only usefull when receive the parameter and pass it throw
 */
public class MethodReferences {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //System.out is an object, println is the instance method of that object
        numbers.forEach(e -> System.out.println(e));
        // passing as an argument
        numbers.forEach(System.out::print);   //method reference to an instance method
        // passing as an argument to a static method
        numbers.stream()
               //.map(e -> String.valueOf(e * 2 ))    // String.valueOf() is a static method so no problem
                .map(String::valueOf)   //this is a method reference, reference to a static method
               .forEach(System.out::println);
        // parameter as a target, parameter needt to be a target ass well
        numbers.stream()
                //.map( e -> e.toString())    // calling a function in the target
                .map( e -> String.valueOf(e))
                .map(String::toString)        // this is an instance method
                .forEach(System.out::println);

        // two parameters as arguments
        System.out.println(
        numbers.stream()
                //.reduce( 0, (total, e) -> Integer.sum(total, e))    // reduce( initial value, Integer.sum function
                // eliminating noise code
                .reduce( 0, Integer::sum)
        );

        numbers.stream().map(String::valueOf).forEach(System.out::print); System.out.println();
        // despliega: 12345678910

        System.out.println(
        numbers.stream()
                .map(String::valueOf)
                .reduce("Initial value of this concatenated string + ...", (carry, str) -> carry.concat(str))
        );

        // eliminating niose code more
        System.out.println(
        numbers.stream()
                .map(String::valueOf)
                .reduce( "Initial Value of this...", String::concat )
        );

        //thera are two limitation when two parameters
        // you cannot use them when you are doing any manipulacion of data
        // and when an conflict with instatnce method and static method

    }
}
