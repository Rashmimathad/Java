package com.xworkz.bookapp.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private int bookId;
    private String  book_title;
    private String author_name;
    private double price;
    private String genre;
    private int published_year;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", book_title='" + book_title + '\'' +
                ", author_name='" + author_name + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", published_year=" + published_year +
                '}';
    }
}
