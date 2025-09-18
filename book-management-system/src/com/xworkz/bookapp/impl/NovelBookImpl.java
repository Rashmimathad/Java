package com.xworkz.bookapp.impl;

import com.xworkz.bookapp.book.Book;

public class NovelBookImpl implements Book {
    @Override
    public void open() {
        System.out.println("Novel Book Opened");
    }

    @Override
    public void read() {
        System.out.println("Novel Book read");
    }

    @Override
    public void close() {
        System.out.println("Novel Book Closed");
    }
}
