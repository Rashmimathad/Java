package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {

    Book book;

    public boolean addBook(Book book){
        boolean isBookAdded=false;

        BookValidator validateBook = new BookValidator();
        boolean isBookValidated=validateBook.validateBookInfo(book);

        if (isBookValidated){
            this.book=book;
            isBookAdded=true;
        }
        return isBookAdded;
    }

    public void getBookDetails(){
        System.out.println("Book Id is : "+book.getBookId());
        System.out.println("Book Name is : "+book.getBookName());
        System.out.println("Genre of the book is : "+book.getGenre());
        System.out.println("Author of the book is : "+book.getAuthorName());
        System.out.println("Publisher of the book is : "+book.getPublisherName());
        System.out.println("Published year of the book is : "+book.getPublishedYear());
    }
}
