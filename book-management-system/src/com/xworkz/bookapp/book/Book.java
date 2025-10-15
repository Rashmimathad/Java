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
    private String  bookTitle;
    private String authorName;
    private double price;
    private String genre;
    private int publishedYear;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookTitle='" + bookTitle + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                ", genre='" + genre + '\'' +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
