package com.xworkz.theatreapp;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.theatre.Theatre;

public class TheatreRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Movie movieOne=new Movie();
        movieOne.setMovieId(101);
        movieOne.setMovieName("Kantara");
        movieOne.setTicketPrice(150.00);
        movieOne.setMovieGenre("Drama/Thriller");
        movieOne.setDuration("2:30");
        movieOne.setLanguage("Kannada");

        Theatre theatre=new Theatre();
        boolean isMovieAdded=theatre.addMovie(movieOne);
        if (isMovieAdded)
            theatre.getMovieDetails();

        System.out.println("main endedpl");
    }
}
