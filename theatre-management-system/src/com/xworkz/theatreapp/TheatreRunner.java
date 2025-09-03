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

        Movie movieTwo = new Movie();
        movieTwo.setMovieId(102);
        movieTwo.setMovieName("RRR");
        movieTwo.setTicketPrice(200.00);
        movieTwo.setMovieGenre("Action/Drama");
        movieTwo.setDuration("3:07");
        movieTwo.setLanguage("Telugu");

        Movie movieThree = new Movie();
        movieThree.setMovieId(103);
        movieThree.setMovieName("KGF Chapter 2");
        movieThree.setTicketPrice(180.00);
        movieThree.setMovieGenre("Action/Thriller");
        movieThree.setDuration("2:48");
        movieThree.setLanguage("Kannada");

        Movie movieFour = new Movie();
        movieFour.setMovieId(104);
        movieFour.setMovieName("Baahubali: The Beginning");
        movieFour.setTicketPrice(170.00);
        movieFour.setMovieGenre("Historical/Fantasy");
        movieFour.setDuration("2:39");
        movieFour.setLanguage("Telugu");

        Movie movieFive = new Movie();
        movieFive.setMovieId(105);
        movieFive.setMovieName("Baahubali: The Conclusion");
        movieFive.setTicketPrice(180.00);
        movieFive.setMovieGenre("Historical/Fantasy");
        movieFive.setDuration("2:47");
        movieFive.setLanguage("Telugu");

        Movie movieSix = new Movie();
        movieSix.setMovieId(106);
        movieSix.setMovieName("Pushpa: The Rise");
        movieSix.setTicketPrice(160.00);
        movieSix.setMovieGenre("Action/Drama");
        movieSix.setDuration("2:56");
        movieSix.setLanguage("Telugu");

        Movie movieSeven = new Movie();
        movieSeven.setMovieId(107);
        movieSeven.setMovieName("Vikram");
        movieSeven.setTicketPrice(175.00);
        movieSeven.setMovieGenre("Action/Thriller");
        movieSeven.setDuration("2:55");
        movieSeven.setLanguage("Tamil");

        Movie movieEight = new Movie();
        movieEight.setMovieId(108);
        movieEight.setMovieName("Leo");
        movieEight.setTicketPrice(190.00);
        movieEight.setMovieGenre("Action/Thriller");
        movieEight.setDuration("2:44");
        movieEight.setLanguage("Tamil");

        Movie movieNine = new Movie();
        movieNine.setMovieId(109);
        movieNine.setMovieName("Jawan");
        movieNine.setTicketPrice(210.00);
        movieNine.setMovieGenre("Action/Drama");
        movieNine.setDuration("2:50");
        movieNine.setLanguage("Hindi");

        Movie movieTen = new Movie();
        movieTen.setMovieId(110);
        movieTen.setMovieName("Pathaan");
        movieTen.setTicketPrice(200.00);
        movieTen.setMovieGenre("Action/Spy Thriller");
        movieTen.setDuration("2:46");
        movieTen.setLanguage("Hindi");


        Theatre theatre=new Theatre();
        System.out.println("Is Movie One added? : "+theatre.addMovie(movieOne));
        System.out.println("Is Movie Two added? : "+theatre.addMovie(movieTwo));
        System.out.println("Is Movie Three added? : "+theatre.addMovie(movieThree));
        System.out.println("Is Movie Four added? : "+theatre.addMovie(movieFour));
        System.out.println("Is Movie Five added? : "+theatre.addMovie(movieFive));
        System.out.println("Is Movie Six added? : "+theatre.addMovie(movieSix));
        System.out.println("Is Movie Seven added? : "+theatre.addMovie(movieSeven));
        System.out.println("Is Movie Eight added? : "+theatre.addMovie(movieEight));
        System.out.println("Is Movie Nine added? : "+theatre.addMovie(movieNine));
        System.out.println("Is Movie Ten added? : "+theatre.addMovie(movieTen));

        theatre.getAllMovieDetails();

        System.out.println("main ended");
    }
}
