package org.rastalion.chapter20_collections.demo6;

import java.time.LocalDate;

public class MovieApp { 
    public static void main (String[] args) {
        MovieDB db = new MovieDB();

        LocalDate releaseDateMov1 = LocalDate.of(2014,07,25);
        Movie lucy = new Movie("Lucy", releaseDateMov1);
        lucy.setDescr("A woman, accidentally caught in a dark deal, " +
                "turns the tables on her captors and transforms into a merciless warrior evolved beyond human logic.");

        LocalDate releaseDateMov2 = LocalDate.of(2014,11,7);
        Movie interstellar = new Movie("Interstellar", releaseDateMov2);
        interstellar.setDescr("A team of explorers travel through a wormhole in space " +
                "in an attempt to ensure humanity's survival.");

        LocalDate releaseDateMov3 = LocalDate.of(2014,4,18);
        Movie transcendence = new Movie("Transcendence", releaseDateMov3);
        transcendence.setDescr("A scientist's drive for artificial intelligence, " +
                "takes on dangerous implications when his consciousness is uploaded into one such program.");

        LocalDate releaseDateMov4 = LocalDate.of(2010,7,16);
        Movie inception = new Movie("Inception", releaseDateMov4);
        inception.setDescr("A thief, who steals corporate secrets through the use of dream-sharing technology, " +
                "is given the inverse task of planting an idea into the mind of a CEO.");

        LocalDate releaseDateMov5 = LocalDate.of(2010,2,19);
        Movie shutterIsland = new Movie("Shutter Island", releaseDateMov5);
        shutterIsland.setDescr("In 1954, a U.S. Marshal investigates the disappearance of a murderer, " +
                "who escaped from a hospital for the criminally insane.");

        db.addMovie(transcendence);
        db.addMovie(shutterIsland);
        db.addMovie(inception);
        db.addMovie(interstellar);
        db.addMovie(lucy);

//        db.printOutColl();

        System.out.println("\n\n");
        Movie temp = db.findById(2);
        System.out.println(temp);
        db.remMovie(2);

        temp = db.findById(2);
        System.out.println(temp);
        
       

//        db.printOutColl();
    }

}
