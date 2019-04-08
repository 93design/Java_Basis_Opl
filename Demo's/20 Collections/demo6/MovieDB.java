package org.rastalion.chapter20_collections.demo6;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MovieDB {

    private int counter;
    Map<Integer, Movie> movCol;

    Movie temp = new Movie("Default", LocalDate.of(0,1,1));

    public MovieDB() {
        movCol = new HashMap<>();
    }

    public Movie findById(Integer key) {
        if(movCol.containsKey(key)) {
            return movCol.get(key);
        }
        return temp;
    }

    public void addMovie(Movie movie) {
        movCol.put(counter++,movie);
    }

    public void remMovie(Integer key) {
        if(movCol.containsKey(key)) {
            movCol.remove(key);
        }
    }

    public void printOutColl() {
        movCol.forEach((key, movie) -> System.out.println("Element: "+key + "\n" +movie + "\n"));
    }

}
