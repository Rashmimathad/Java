package com.xworkz.movieapp;

import com.xworkz.movieapp.movie.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRunner {

    public static void main(String[] args) {

        List<Movie> movies = new ArrayList<>();

        Movie movieOne = new Movie(1, "Inception", "148 minutes", "Sci-Fi", 15.99, "Christopher Nolan", "English");
        Movie movieTwo = new Movie(2, "The Shawshank Redemption", "142 minutes", "Drama", 12.99, "Frank Darabont", "English");
        Movie movieThree = new Movie(3, "The Dark Knight", "152 minutes", "Action", 14.99, "Christopher Nolan", "English");
        Movie movieFour = new Movie(4, "Pulp Fiction", "154 minutes", "Crime", 13.99, "Quentin Tarantino", "English");
        Movie movieFive = new Movie(5, "The Godfather", "175 minutes", "Crime", 16.99, "Francis Ford Coppola", "English");
        Movie movieSix = new Movie(6, "The Matrix", "136 minutes", "Sci-Fi", 11.99, "Lana Wachowski, Lilly Wachowski", "English");
        Movie movieSeven = new Movie(7, "Forrest Gump", "142 minutes", "Drama", 12.49, "Robert Zemeckis", "English");
        Movie movieEight = new Movie(8, "The Lord of the Rings: The Return of the King", "201 minutes", "Fantasy", 17.99, "Peter Jackson", "English");
        Movie movieNine = new Movie(9, "The Empire Strikes Back", "124 minutes", "Sci-Fi", 10.99, "Irvin Kershner", "English");
        Movie movieTen = new Movie(10, "The Lion King", "88 minutes", "Animation", 9.99, "Roger Allers, Rob Minkoff", "English");
        Movie movieEleven = new Movie(11, "Gladiator", "155 minutes", "Action", 13.49, "Ridley Scott", "English");
        Movie movieTwelve = new Movie(12, "The Prestige", "130 minutes", "Drama", 12.49, "Christopher Nolan", "English");
        Movie movieThirteen = new Movie(13, "Interstellar", "169 minutes", "Sci-Fi", 14.99, "Christopher Nolan", "English");
        Movie movieFourteen = new Movie(14, "The Departed", "151 minutes", "Crime", 13.49, "Martin Scorsese", "English");
        Movie movieFifteen = new Movie(15, "The Green Mile", "189 minutes", "Drama", 15.49, "Frank Darabont", "English");
        Movie movieSixteen = new Movie(16, "Se7en", "127 minutes", "Crime", 12.99, "David Fincher", "English");
        Movie movieSeventeen = new Movie(17, "The Silence of the Lambs", "118 minutes", "Thriller", 11.99, "Jonathan Demme", "English");
        Movie movieEighteen = new Movie(18, "Schindler's List", "195 minutes", "Biography", 16.49, "Steven Spielberg", "English");
        Movie movieNineteen = new Movie(19, "Fight Club", "139 minutes", "Drama", 13.99, "David Fincher", "English");
        Movie movieTwenty = new Movie(20, "The Usual Suspects", "106 minutes", "Crime", 10.99, "Bryan Singer", "English");

        movies.add(movieOne);
        movies.add(movieTwo);
        movies.add(movieThree);
        movies.add(movieFour);
        movies.add(movieFive);
        movies.add(movieSix);
        movies.add(movieSeven);
        movies.add(movieEight);
        movies.add(movieNine);
        movies.add(movieTen);
        movies.add(movieEleven);
        movies.add(movieTwelve);
        movies.add(movieThirteen);
        movies.add(movieFourteen);
        movies.add(movieFifteen);
        movies.add(movieSixteen);
        movies.add(movieSeventeen);
        movies.add(movieEighteen);
        movies.add(movieNineteen);
        movies.add(movieTwenty);

        System.out.println("Total movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
        System.out.println();

        List<Movie> movies1 = new ArrayList<>();
        Movie movieTwentyOne = new Movie(21, "The Dark Knight Rises", "164 minutes", "Action", 14.49, "Christopher Nolan", "English");
        Movie movieTwentyTwo = new Movie(22, "Inglourious Basterds", "153 minutes", "War", 13.99, "Quentin Tarantino", "English");
        Movie movieTwentyThree = new Movie(23, "The Social Network", "120 minutes", "Biography", 11.49, "David Fincher", "English");
        Movie movieTwentyFour = new Movie(24, "The Wolf of Wall Street", "180 minutes", "Biography", 15.99, "Martin Scorsese", "English");
        Movie movieTwentyFive = new Movie(25, "Django Unchained", "165 minutes", "Western", 14.99, "Quentin Tarantino", "English");

        movies1.add(movieTwentyOne);
        movies1.add(movieTwentyTwo);
        movies1.add(movieTwentyThree);
        movies1.add(movieTwentyFour);
        movies1.add(movieTwentyFive);

        System.out.println("Total movies of movies1:");
        for (Movie movie : movies1) {
            System.out.println(movie);
        }
        System.out.println();

        System.out.println("Is movies1 added to movies: " + movies.addAll(movies1));
        System.out.println("Is movies contains movieSeven: " + movies.contains(movieSeven));
        System.out.println("Is movies contains all movies1: " + movies.containsAll(movies1));
        System.out.println();

        System.out.println("Total movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }

        System.out.println();
        System.out.println("Is movieTwentyOne removed: " + movies.remove(movieTwentyOne));
        System.out.println("Is movies1 removed from movies: " + movies.removeAll(movies1));
        System.out.println();
        System.out.println("Total movies:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
