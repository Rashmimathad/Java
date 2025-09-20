package com.xworkz.theatreapp.validator;

import com.xworkz.theatreapp.movie.Movie;

public class MovieValidator {

    public boolean validateMovie(Movie movie){
        boolean isMovieValidated=false;
        boolean isMovieIdValid=false;
        boolean isMovieNameValid=false;
        boolean isTicketPriceValid=false;
        boolean isMovieGenreValid=false;
        boolean isDurationValid=false;
        boolean isLanguageValid=false;

        if (movie.getMovieId()!=0)
            isMovieIdValid=true;
        else System.out.println("Invalid Movie Id");

        if (movie.getMovieName()!=null && !movie.getMovieName().isEmpty())
            isMovieNameValid=true;
        else System.out.println("Invalid movie name");

        if (movie.getMovieGenre()!=null)
            isMovieGenreValid=true;
        else System.out.println("Invalid Genre");

        if (movie.getTicketPrice()!=0.0)
            isTicketPriceValid=true;
        else System.out.println("Invalid ticket price");

        if (movie.getDuration()!=null && !movie.getDuration().isEmpty())
            isDurationValid=true;
        else System.out.println("Invalid Duration");

        if (movie.getLanguage()!=null && !movie.getLanguage().isEmpty())
            isLanguageValid=true;
        else System.out.println("Invalid language");

        if (isMovieIdValid && isMovieNameValid && isTicketPriceValid && isMovieGenreValid && isDurationValid && isLanguageValid){
            isMovieValidated=true;
        }

        return isMovieValidated;
    }
}
