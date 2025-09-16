package com.xworkz.libraryapp.validator;

import com.xworkz.libraryapp.book.Book;

public class BookValidator {

    public boolean validateBookInfo(Book book){
        boolean isBookValidated=false;
        boolean isBookIdValid=false;
        boolean isBookNameValid=false;
        boolean isGenreValid=false;
        boolean isAuthorNameValid=false;
        boolean isPublisherNameValid=false;
        boolean isPublishedYearValid=false;

        if (book.getBookId()!=0)
            isBookIdValid=true;
        else System.out.println("Invalid book Id");

        if (book.getBookName()!=null && !book.getBookName().isEmpty())
            isBookNameValid=true;
        else System.out.println("Invalid book name");

        if (book.getGenre()!=null)
            isGenreValid=true;
        else System.out.println("Invalid Genre");

        if (book.getAuthorName()!=null && !book.getAuthorName().isEmpty())
            isAuthorNameValid=true;
        else System.out.println("Invalid Author Name");

        if (book.getPublisherName()!=null && !book.getPublisherName().isEmpty())
            isPublisherNameValid=true;
        else System.out.println("Invalid Publisher name");

        if (book.getPublishedYear()!=0)
            isPublishedYearValid=true;
        else System.out.println("Invalid published year");

        if (isBookIdValid && isBookNameValid && isGenreValid && isAuthorNameValid && isPublisherNameValid && isPublishedYearValid){
            isBookValidated=true;
        }else System.out.println("Book not validated!!");
        return isBookValidated;
    }
}
