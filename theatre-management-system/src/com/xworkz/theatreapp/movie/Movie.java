package com.xworkz.theatreapp.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Movie {

    private int movieId;
    private String movieName;
    private double ticketPrice;
    private String movieGenre;
    private String duration;
    private String language;

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
