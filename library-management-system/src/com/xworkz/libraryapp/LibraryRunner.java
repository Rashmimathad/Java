package com.xworkz.libraryapp;

import com.xworkz.libraryapp.impl.CentralLibraryImpl;
import com.xworkz.libraryapp.library.Library;

public class LibraryRunner {
    public static void main(String[] args) {
        Library library=new CentralLibraryImpl();
        library.addBook();
        library.borrowBook();
        library.returnBook();
    }
}
