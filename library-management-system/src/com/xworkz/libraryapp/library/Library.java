package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {

    Book[] books = new Book[14];
    int index;

    public boolean addBook(Book book){
        boolean isBookAdded=false;

        BookValidator validateBook = new BookValidator();

        if (book!=null && validateBook.validateBookInfo(book)){
            books[index++]=book;
            isBookAdded=true;
        }
        return isBookAdded;
    }

    public void getALlBooksDetails(){
        System.out.println("Books Details are :");
        System.out.println();
        for (Book book : books) {
            System.out.println("Book Id is : " + book.getBookId());
            System.out.println("Book Name is : " + book.getBookName());
            System.out.println("Genre of the book is : " + book.getGenre());
            System.out.println("Author of the book is : " + book.getAuthorName());
            System.out.println("Publisher of the book is : " + book.getPublisherName());
            System.out.println("Published year of the book is : " + book.getPublishedYear());
            System.out.println("-------------------------------------------------------------------");
        }
    }
}
