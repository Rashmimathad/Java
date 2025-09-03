package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validator.MovieValidator;

public class Theatre {
    Movie[] movies = new Movie[10];
    int index;
    public boolean addMovie(Movie movie){
        boolean isMovieAdded=false;

        MovieValidator movieValidator=new MovieValidator();
        if (movie!=null && movieValidator.validateMovie(movie)){
            movies[index++]=movie;
            isMovieAdded=true;
        }
        return isMovieAdded;
    }

    public void getAllMovieDetails(){
        System.out.println("All movie details are :");
        System.out.println();
        for (Movie movie : movies) {
            System.out.println("Movie Id is : " + movie.getMovieId());
            System.out.println("Movie name is : " + movie.getMovieName());
            System.out.println("Movie Ticket price is : " + movie.getTicketPrice());
            System.out.println("Genre of the movie is : " + movie.getMovieGenre());
            System.out.println("Duration of movie is : " + movie.getDuration() + " hrs");
            System.out.println("Language of the movie is : " + movie.getLanguage());
            System.out.println("------------------------------------------------------------");
        }
    }
}
