package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        Book bookOne = new Book();
        bookOne.setBookId(101);
        bookOne.setBookName("Ikigai");
        bookOne.setGenre("Self Help");
        bookOne.setAuthorName("Hector Garcia");
        bookOne.setPublisherName("Penguin Books");
        bookOne.setPublishedYear(2017);

        Library library = new Library();
        boolean bookAdded= library.addBook(bookOne);
        System.out.println("Is Book Added : "+bookAdded);
        if (bookAdded)
            library.getBookDetails();

        System.out.println("Main ended");
    }
}
