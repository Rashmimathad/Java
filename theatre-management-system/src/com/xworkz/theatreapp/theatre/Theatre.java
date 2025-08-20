package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validator.MovieValidator;

public class Theatre {
    Movie movie;

    public boolean addMovie(Movie movie){
        boolean isMovieAdded=false;

        MovieValidator movieValidator=new MovieValidator();
        boolean isMovieValidated=movieValidator.validateMovie(movie);
        if (isMovieValidated){
            this.movie=movie;
            isMovieAdded=true;
        }
        return isMovieAdded;
    }

    public void getMovieDetails(){
        System.out.println("Movie Id is : "+movie.getMovieId());
        System.out.println("Movie name is : "+movie.getMovieName());
        System.out.println("Movie Ticket price is : "+movie.getTicketPrice());
        System.out.println("Genre of the movie is : "+movie.getMovieGenre());
        System.out.println("Duration of movie is : "+movie.getDuration()+" hrs");
        System.out.println("Language of the movie is : "+movie.getLanguage());
    }
}
