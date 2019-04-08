package org.rastalion.chapter20_collections.demo6;

import java.time.LocalDate;
import java.util.Objects;

public class Movie {

    private String nameMov;
    private String descr;
    private LocalDate yearOfRelease;

    public Movie (String nameMov, LocalDate yearOfRelease) {
        this.nameMov = nameMov;
        this.yearOfRelease = yearOfRelease;
    }

    public Movie (String nameMov, String descr,
                  LocalDate yearOfRelease, int lengthInMin) {
        this.nameMov = nameMov;
        this.descr = descr;
        this.yearOfRelease = yearOfRelease;
    }

    public String getNameMov () {
        return nameMov;
    }

    public void setNameMov (String nameMov) {
        this.nameMov = nameMov;
    }

    public String getDescr () {
        return descr;
    }

    public void setDescr (String descr) {
        this.descr = descr;
    }

    public LocalDate getYearOfRelease () {
        return yearOfRelease;
    }


    public void setYearOfRelease (LocalDate yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(nameMov, movie.nameMov) &&
                Objects.equals(descr, movie.descr) &&
                Objects.equals(yearOfRelease, movie.yearOfRelease);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameMov, descr, yearOfRelease);
    }

    @Override
    public String toString () {
        return String.format("Name of movie: %s\n\nDescription:" +
                "\n%s\n\nReleaseDate:\n%s" , nameMov, descr, yearOfRelease);
    }

}
