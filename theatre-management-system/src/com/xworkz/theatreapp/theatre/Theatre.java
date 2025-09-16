package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.constants.Genre;
import com.xworkz.theatreapp.movie.Movie;
import com.xworkz.theatreapp.validator.MovieValidator;

public class Theatre {

    public Theatre(int size){
        this.movies=new Movie[size];
    }

    public Movie[] movies;
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

    public boolean updateMoviePriceByMovieId(int movieId, double newPrice) {
        boolean isPriceUpdated=false;
        if (newPrice>0) {
            for (int i = 0; i < movies.length; i++) {
                if (movies[i].getMovieId() == movieId) {
                    movies[i].setTicketPrice(newPrice);
                    isPriceUpdated = true;
                }
            }
        }else System.out.println("Updated price must be greater than 0");
        if (isPriceUpdated!=false)  System.out.println("Updated Movie ticket price  for Id " + movieId+ " is : "+newPrice);
        System.out.println("Movie with Id " + movieId + " not found");
        return isPriceUpdated;
    }


    public boolean updateMovieLanguageByMovieId(int movieId, String newLanguage) {
        boolean isLanguageUpdated=false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getMovieId() == movieId) {
                movies[i].setLanguage(newLanguage);
                isLanguageUpdated=true;
            }
        }
        if (isLanguageUpdated!=false)  System.out.println("Updated Movie Language for Id " + movieId+" is : "+newLanguage);
        System.out.println("Movie with Id " + movieId + " not found");
        return isLanguageUpdated;
    }

    public String getMovieNameByMovieId(int movieId){
        String movieName=null;
        for (Movie movie:movies){
            if (movie.getMovieId()==movieId){
                movieName=movie.getMovieName();
            }
        }
        if (movieName!=null) return "The name of the movie with Id "+movieId+" is : "+movieName;
        return "Movie with Id "+movieId+" not found";
    }

    public  Double getMovieTicketPriceByMovieName(String movieName){
        double price=0;
        for (Movie movie: movies){
            if (movie.getMovieName().equalsIgnoreCase(movieName)){
                price=movie.getTicketPrice();
            }
        }
        if (price!=0) System.out.println("The ticket price of the movie : "+movieName+" is : Rs."+price);
        else System.out.println("Movie "+movieName+" not found");
        return price;
    }

    public Movie getMovieInfoById(int movieId){
        Movie movie=null;
        for (Movie movie1: movies){
            if (movie1.getMovieId()==movieId){
                movie=movie1;
            }
        }
        if (movie!=null) return movie;
        return null;
    }

    public Genre getMovieGenreByMovieName(String movieName){
        Genre genre=null;
        for (Movie movie:movies){
            if (movie.getMovieName().equalsIgnoreCase(movieName)){
                genre=movie.getMovieGenre();
            }
        }
        if (genre!=null) System.out.println("The Genre of the movie "+movieName+" is : "+genre);
        else System.out.println("Movie "+movieName+" not found");
        return genre;
    }

    public String getLanguageByMovieId(int movieId){
        String language=null;
        for (Movie movie:movies){
            if (movie.getMovieId()==movieId){
                language=movie.getLanguage();
            }
        }
       if (language!=null) return "The language of the movie with Id"+movieId+" is : "+language;
        else return "Movie with Id "+movieId+" not found";
    }

    public String getDurationByMovieId(int movieId){
        String duration=null;
        for (Movie movie:movies){
            if (movie.getMovieId()==movieId){
                duration=movie.getDuration();
            }
        }

        if (duration!=null) return "The Duration of the movie with Id "+movieId+" is : "+duration+" hrs";
        else return "Movie with Id "+movieId+" not found";
    }

    public boolean deleteMovieByMovieId(int movieId){
        boolean isMovieDeleted=false;
        int length=movies.length;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getMovieId()==movieId){
                for(int j=i;j<movies.length;j++){
                    movies[j]=movies[j+1];
                }
                movies[movies.length-1]=null;
                length--;
                isMovieDeleted=true;
                break;
            }
        }
        if (isMovieDeleted==false) System.out.println("Movie with Id "+movieId+" not found");
        return isMovieDeleted;
    }

    public  void displayMovieInfo(Movie movie){
        if (movie!=null) {
            System.out.println("Movie Id is : " + movie.getMovieId());
            System.out.println("Movie name is : " + movie.getMovieName());
            System.out.println("Movie Ticket price is : " + movie.getTicketPrice());
            System.out.println("Genre of the movie is : " + movie.getMovieGenre());
            System.out.println("Duration of movie is : " + movie.getDuration() + " hrs");
            System.out.println("Language of the movie is : " + movie.getLanguage());
            System.out.println("------------------------------------------------------------");
        }
    }
    public void getAllMovieDetails(){
        System.out.println("All movie details are :");
        System.out.println();
        for (Movie movie : movies) {
            if (movie!=null) {
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
}
