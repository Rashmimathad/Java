package com.xworkz.bookapp;

import com.xworkz.bookapp.book.Book;

import java.util.ArrayList;
import java.util.List;

public class BookRunner {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        Book bookOne = new Book(1, "1984", "George Orwell", 499.0, "Dystopian", 1949);
        Book bookTwo = new Book(2, "To Kill a Mockingbird", "Harper Lee", 399.0, "Fiction", 1960);
        Book bookThree = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", 299.0, "Classic", 1925);
        Book bookFour = new Book(4, "Pride and Prejudice", "Jane Austen", 349.0, "Romance", 1813);
        Book bookFive = new Book(5, "Moby Dick", "Herman Melville", 449.0, "Adventure", 1851);
        Book bookSix = new Book(6, "War and Peace", "Leo Tolstoy", 599.0, "Historical", 1869);
        Book bookSeven = new Book(7, "The Catcher in the Rye", "J. D. Salinger", 299.0, "Fiction", 1951);
        Book bookEight = new Book(8, "Brave New World", "Aldous Huxley", 379.0, "Dystopian", 1932);
        Book bookNine = new Book(9, "The Hobbit", "J. R. R. Tolkien", 499.0, "Fantasy", 1937);
        Book bookTen = new Book(10, "Fahrenheit 451", "Ray Bradbury", 329.0, "Sci-Fi", 1953);
        Book bookEleven = new Book(11, "The Odyssey", "Homer", 259.0, "Epic", -800);
        Book bookTwelve = new Book(12, "Crime and Punishment", "Fyodor Dostoevsky", 399.0, "Psychological", 1866);
        Book bookThirteen = new Book(13, "The Brothers Karamazov", "Fyodor Dostoevsky", 499.0, "Philosophical", 1880);
        Book bookFourteen = new Book(14, "Don Quixote", "Miguel de Cervantes", 549.0, "Adventure", 1615);
        Book bookFifteen = new Book(15, "The Divine Comedy", "Dante Alighieri", 699.0, "Epic", 1320);
        Book bookSixteen = new Book(16, "One Hundred Years of Solitude", "Gabriel García Márquez", 399.0, "Magic Realism", 1967);
        Book bookSeventeen = new Book(17, "Ulysses", "James Joyce", 599.0, "Modernist", 1922);
        Book bookEighteen = new Book(18, "The Iliad", "Homer", 279.0, "Epic", -750);
        Book bookNineteen = new Book(19, "Anna Karenina", "Leo Tolstoy", 449.0, "Realist", 1878);
        Book bookTwenty = new Book(20, "Madame Bovary", "Gustave Flaubert", 379.0, "Realist", 1856);

        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        books.add(bookFour);
        books.add(bookFive);
        books.add(bookSix);
        books.add(bookSeven);
        books.add(bookEight);
        books.add(bookNine);
        books.add(bookTen);
        books.add(bookEleven);
        books.add(bookTwelve);
        books.add(bookThirteen);
        books.add(bookFourteen);
        books.add(bookFifteen);
        books.add(bookSixteen);
        books.add(bookSeventeen);
        books.add(bookEighteen);
        books.add(bookNineteen);
        books.add(bookTwenty);

        System.out.println("Total books:");
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();

        List<Book> books1=new ArrayList<>();
        Book bookTwentyOne = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", 499.0, "Tragedy", 1925);
        Book bookTwentyTwo = new Book(2, "To Kill a Mockingbird", "Harper Lee", 399.0, "Fiction", 1960);
        Book bookTwentyThree = new Book(3, "1984", "George Orwell", 299.0, "Dystopian", 1949);
        Book bookTwentyFour = new Book(4, "Pride and Prejudice", "Jane Austen", 349.0, "Romance", 1813);
        Book bookTwentyFive = new Book(5, "The Catcher in the Rye", "J.D. Salinger", 399.0, "Coming-of-age", 1951);

        books1.add(bookTwentyOne);
        books1.add(bookTwentyTwo);
        books1.add(bookTwentyThree);
        books1.add(bookTwentyFour);
        books1.add(bookTwentyFive);

        System.out.println("Total books of books1:");
        for (Book book : books1) {
            System.out.println(book);
        }
        System.out.println();

        System.out.println("Is books1 added to books : "+books.addAll(books1));
        System.out.println("Is books conatins bookSeven : "+books.contains(bookSeven));
        System.out.println("Is books containsm books1 : "+books.containsAll(books1));
        System.out.println();

        System.out.println("Total books :");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println();
        System.out.println("Is bookTwentyOne removed : "+books.remove(bookTwentyOne));
        System.out.println("Is books1 removed from books : "+books.removeAll(books1));
        System.out.println();
        System.out.println("Total books :");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
