package lambdaStreams;

import java.util.stream.Stream;

/**
 * Created by Bext on 21/02/2017.
 */
public class InfiniteStream {
    public static int compute( int k, int n) {
    /*    int result = 0;

        int index = k;
        int count = 0;
        while (count <= n) {
            if (index % 2 == 0 %%Math.sqrt(index) > 20){
                result += index * 2;
                count++;
            }
            index++;
        }
        return result;
    */
       return Stream.iterate(k , e -> e + 1)      //unbounded, lazy
               .filter( e -> e % 2 == 0)            //unbounded, lazy
               .filter( e -> Math.sqrt(e) > 20)     //unbounded, lazy
               .mapToInt( e -> e * 2)               //unbounded, lazy
               .limit(n)                            //sized, lazy
               .sum();
    }

    public static void main(String[] args) {
        //Stream.iterate(100, e -> e + 1);

        //start with 100, create a series
        // 100, 101, 102, 103, ...

        //Given a number k, and a count n, find the total of double of n
        //even numbers stating with k, where sqrt of each number is > 2
        int k = 121;
        int n = 51;
        System.out.println(compute(k ,n));
    }
}
