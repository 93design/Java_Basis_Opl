package lambdaStreams;

/**
 * Created by Bext on 20/02/2017.
 */
public class TimeIt {
    public static void code( Runnable block) {
        long start = System.nanoTime();
        try {
            block.run();
        } finally {
            long end = System.nanoTime();
            System.out.println("Time taken(s): " + (end - start)/1.0e9);
        }
    }
}
