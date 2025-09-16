package com.xworkz.libraryapp;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Genre;
import com.xworkz.libraryapp.library.Library;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        System.out.println("Main started");
        System.out.println();

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of books to be added : ");
        Library library=new Library(sc.nextInt());
        System.out.print("Total number of books to be added in library : "+library.books.length);

        for (int i = 0; i <library.books.length ; i++) {
            Book book=new Book();
            System.out.println();
            System.out.println("Enter book "+(i+1)+" details : ");
            System.out.println();

            System.out.print("Enter the book Id : ");
            book.setBookId(sc.nextInt());

            System.out.print("Enter the book name : ");sc.nextLine();
            book.setBookName(sc.nextLine());

            System.out.print("Enter the genre name : ");
            book.setGenre(Genre.valueOf(sc.next().toUpperCase()));

            System.out.print("Enter the author name of book : ");sc.nextLine();
            book.setAuthorName(sc.nextLine());

            System.out.print("Enter publisher name of the book : ");
            book.setPublisherName(sc.nextLine());

            System.out.print("Enter the published year of book : ");
            book.setPublishedYear(sc.nextInt());

            library.addBook(book);
            System.out.println("Number of books left to be added : "+(library.books.length-(i+1)));
        }

        System.out.println();
        library.getALlBooksDetails();

        System.out.println();
        System.out.print("Enter the book Id to get book name : ");
        System.out.println(library.getBookNameById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the book name to get Author name : ");sc.nextLine();
        System.out.println(library.getAuthorNameByBookName(sc.nextLine()));

        System.out.println();
        System.out.print("Enter the book Id to get book info : ");
        library.displayBookInfo(library.getBookInfoById(sc.nextInt()));

        System.out.println();
        System.out.print("Enter the book Id to be deleted : ");
        library.deleteBookById(sc.nextInt());
//        Book bookOne = new Book();
//        bookOne.setBookId(101);
//        bookOne.setBookName("Ikigai");
//        bookOne.setGenre("Self Help");
//        bookOne.setAuthorName("Hector Garcia");
//        bookOne.setPublisherName("Penguin Books");
//        bookOne.setPublishedYear(2017);
//
//        Book bookTwo = new Book();
//        bookTwo.setBookId(102);
//        bookTwo.setBookName("Atomic Habits");
//        bookTwo.setGenre("Self Improvement");
//        bookTwo.setAuthorName("James Clear");
//        bookTwo.setPublisherName("Penguin Random House");
//        bookTwo.setPublishedYear(2018);
//
//        Book bookThree = new Book();
//        bookThree.setBookId(103);
//        bookThree.setBookName("The Alchemist");
//        bookThree.setGenre("Fiction");
//        bookThree.setAuthorName("Paulo Coelho");
//        bookThree.setPublisherName("HarperCollins");
//        bookThree.setPublishedYear(1988);
//
//        Book bookFour = new Book();
//        bookFour.setBookId(104);
//        bookFour.setBookName("Think and Grow Rich");
//        bookFour.setGenre("Motivational");
//        bookFour.setAuthorName("Napoleon Hill");
//        bookFour.setPublisherName("The Ralston Society");
//        bookFour.setPublishedYear(1937);
//
//        Book bookFive = new Book();
//        bookFive.setBookId(105);
//        bookFive.setBookName("Wings of Fire");
//        bookFive.setGenre("Autobiography");
//        bookFive.setAuthorName("A. P. J. Abdul Kalam");
//        bookFive.setPublisherName("Universities Press");
//        bookFive.setPublishedYear(1999);
//
//        Book bookSix = new Book();
//        bookSix.setBookId(106);
//        bookSix.setBookName("Rich Dad Poor Dad");
//        bookSix.setGenre("Personal Finance");
//        bookSix.setAuthorName("Robert T. Kiyosaki");
//        bookSix.setPublisherName("Plata Publishing");
//        bookSix.setPublishedYear(1997);
//
//        Book bookSeven = new Book();
//        bookSeven.setBookId(107);
//        bookSeven.setBookName("The Power of Now");
//        bookSeven.setGenre("Spirituality");
//        bookSeven.setAuthorName("Eckhart Tolle");
//        bookSeven.setPublisherName("New World Library");
//        bookSeven.setPublishedYear(1997);
//
//        Book bookEight = new Book();
//        bookEight.setBookId(108);
//        bookEight.setBookName("Sapiens: A Brief History of Humankind");
//        bookEight.setGenre("History");
//        bookEight.setAuthorName("Yuval Noah Harari");
//        bookEight.setPublisherName("Harper");
//        bookEight.setPublishedYear(2011);
//
//        Book bookNine = new Book();
//        bookNine.setBookId(109);
//        bookNine.setBookName("The 5 AM Club");
//        bookNine.setGenre("Motivation");
//        bookNine.setAuthorName("Robin Sharma");
//        bookNine.setPublisherName("HarperCollins");
//        bookNine.setPublishedYear(2018);
//
//        Book bookTen = new Book();
//        bookTen.setBookId(110);
//        bookTen.setBookName("Deep Work");
//        bookTen.setGenre("Productivity");
//        bookTen.setAuthorName("Cal Newport");
//        bookTen.setPublisherName("Grand Central Publishing");
//        bookTen.setPublishedYear(2016);
//
//        Book bookEleven = new Book();
//        bookEleven.setBookId(111);
//        bookEleven.setBookName("The Subtle Art of Not Giving a F*ck");
//        bookEleven.setGenre("Self Help");
//        bookEleven.setAuthorName("Mark Manson");
//        bookEleven.setPublisherName("HarperOne");
//        bookEleven.setPublishedYear(2016);
//
//        Book bookTwelve = new Book();
//        bookTwelve.setBookId(112);
//        bookTwelve.setBookName("You Can Win");
//        bookTwelve.setGenre("Motivational");
//        bookTwelve.setAuthorName("Shiv Khera");
//        bookTwelve.setPublisherName("Macmillan Publishers");
//        bookTwelve.setPublishedYear(1998);
//
//        Book bookThirteen = new Book();
//        bookThirteen.setBookId(113);
//        bookThirteen.setBookName("The Monk Who Sold His Ferrari");
//        bookThirteen.setGenre("Fictional Self Help");
//        bookThirteen.setAuthorName("Robin Sharma");
//        bookThirteen.setPublisherName("HarperCollins");
//        bookThirteen.setPublishedYear(1997);
//
//        Book bookFourteen = new Book();
//        bookFourteen.setBookId(114);
//        bookFourteen.setBookName("Zero to One");
//        bookFourteen.setGenre("Business");
//        bookFourteen.setAuthorName("Peter Thiel");
//        bookFourteen.setPublisherName("Crown Business");
//        bookFourteen.setPublishedYear(2014);
//
//        Library library = new Library();
//        System.out.println("Is Book One Added : "+library.addBook(bookOne));
//        System.out.println("Is Book Two Added : "+library.addBook(bookTwo));
//        System.out.println("Is Book Three Added : "+library.addBook(bookThree));
//        System.out.println("Is Book Four Added : "+library.addBook(bookFour));
//        System.out.println("Is Book Five Added : "+library.addBook(bookFive));
//        System.out.println("Is Book Six Added : "+library.addBook(bookSix));
//        System.out.println("Is Book Seven Added : "+library.addBook(bookSeven));
//        System.out.println("Is Book Eight Added : "+library.addBook(bookEight));
//        System.out.println("Is Book Nine Added : "+library.addBook(bookNine));
//        System.out.println("Is Book Ten Added : "+library.addBook(bookTen));
//        System.out.println("Is Book Eleven Added : "+library.addBook(bookEleven));
//        System.out.println("Is Book Twelve Added : "+library.addBook(bookTwelve));
//        System.out.println("Is Book Thirteen Added : "+library.addBook(bookThirteen));
//        System.out.println("Is Book Fourteen Added : "+library.addBook(bookFourteen));
        System.out.println("Main ended");
    }
}
