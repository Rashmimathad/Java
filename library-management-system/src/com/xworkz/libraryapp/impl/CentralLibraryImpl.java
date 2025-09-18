package com.xworkz.libraryapp.impl;

import com.xworkz.libraryapp.library.Library;

public class CentralLibraryImpl implements Library {
    @Override
    public void addBook() {
        System.out.println("Book added in central library");
    }

    @Override
    public void borrowBook() {
        System.out.println("Book borrowed from Central library");
    }

    @Override
    public void returnBook() {
        System.out.println("Book returned to Central Library");
    }
}
