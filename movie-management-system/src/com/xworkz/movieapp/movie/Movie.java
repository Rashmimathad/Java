package com.xworkz.movieapp.movie;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Movie {
    private int movieId;
    private String movieName;
    private String duration;
    private String genre;
    private double ticketPrice;
    private String directorName;
    private String movieLanguage;

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", duration='" + duration + '\'' +
                ", genre='" + genre + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", directorName='" + directorName + '\'' +
                ", movieLanguage='" + movieLanguage + '\'' +
                '}';
    }
}
