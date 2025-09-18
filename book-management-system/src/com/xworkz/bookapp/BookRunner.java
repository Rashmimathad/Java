package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;
import com.xworkz.bookapp.impl.NovelBookImpl;

public class BookRunner {
    public static void main(String[] args) {
        Book book=new NovelBookImpl();
        book.open();
        book.read();
        book.close();
    }
}
