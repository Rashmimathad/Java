package com.xworkz.theatreapp.movie;

import com.xworkz.theatreapp.constants.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Movie {

    private int movieId;
    private String movieName;
    private double ticketPrice;
    private Genre movieGenre;
    private String duration;
    private String language;

    @Override
    public String toString(){
        return "Movie = {movieId= "+this.movieId+", movieName= "+this.movieName+", ticketPrice= "+this.ticketPrice+", movieGenre= "+this.movieGenre+", duration= "+this.duration+", language= "+this.language+"}";
    }

    @Override
    public  int hashCode(){
        return Objects.hash(movieId,movieName,ticketPrice,movieGenre,duration,language);
    }

    @Override
    public boolean equals(Object obj){
        if (obj instanceof Movie){
            Movie movie=(Movie)obj;
            if (this.movieId==movie.movieId&&this.movieName.equals(movie.movieName)&&this.ticketPrice==movie.ticketPrice&&this.movieGenre.equals(movie.movieGenre)&&this.duration.equals(movie.duration)&&this.language.equals(movie.language))
                return true;
            return false;
        }
        return false;
    }
//    public void setMovieId(int movieId) {
//        this.movieId = movieId;
//    }
//
//    public void setMovieName(String movieName) {
//        this.movieName = movieName;
//    }
//
//    public void setTicketPrice(double ticketPrice) {
//        this.ticketPrice = ticketPrice;
//    }
//
//    public void setMovieGenre(String movieGenre) {
//        this.movieGenre = movieGenre;
//    }
//
//    public void setDuration(String duration) {
//        this.duration = duration;
//    }
//
//    public void setLanguage(String language) {
//        this.language = language;
//    }
//
//    public int getMovieId() {
//        return movieId;
//    }
//
//    public String getMovieName() {
//        return movieName;
//    }
//
//    public double getTicketPrice() {
//        return ticketPrice;
//    }
//
//    public String getMovieGenre() {
//        return movieGenre;
//    }
//
//    public String getDuration() {
//        return duration;
//    }
//
//    public String getLanguage() {
//        return language;
//    }
}
