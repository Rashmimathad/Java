package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Genre;

public interface Library {
    boolean addBook(Book book);
    String getBookNameById(int bookId);
    Genre getGenreByBookName(String bookName);
    String  getAuthorNameByBookName(String bookName);
    String getPublisherNameByBookId(int bookId);
    String getPublisherNameByBookName(String bookName);
    int getPublishedYearByBookName(String bookName);
    int getPublishedYearByBookId(int bookId);
    boolean deleteBookById(int bookId);
    Book getBookInfoById(int bookId);
    void displayBookInfo(Book book);
    void getALlBooksDetails();
}
