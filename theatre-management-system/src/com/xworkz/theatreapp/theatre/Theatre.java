package com.xworkz.theatreapp.theatre;

import com.xworkz.theatreapp.constants.Genre;
import com.xworkz.theatreapp.movie.Movie;

public interface Theatre {
    boolean addMovie(Movie movie);
    boolean updateMoviePriceByMovieId(int movieId, double newPrice);
    boolean updateMovieLanguageByMovieId(int movieId, String newLanguage);
    String getMovieNameByMovieId(int movieId);
    double getMovieTicketPriceByMovieName(String movieName);
    Movie getMovieInfoById(int movieId);
    Genre getMovieGenreByMovieName(String movieName);
    String getLanguageByMovieId(int movieId);
    String getDurationByMovieId(int movieId);
    boolean deleteMovieByMovieId(int movieId);
    void displayMovieInfo(Movie movie);
    void getAllMovieDetails();
}
