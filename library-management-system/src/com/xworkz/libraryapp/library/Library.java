package com.xworkz.libraryapp.library;

import com.xworkz.libraryapp.book.Book;
import com.xworkz.libraryapp.constants.Genre;
import com.xworkz.libraryapp.validator.BookValidator;

public class Library {

    public Library(int size){
        this.books=new Book[size];
    }

    public Book[] books;
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

   public String getBookNameById(int bookId){
        for (Book book:books){
            if (book.getBookId()==bookId)
                return "The name of the book with Id "+bookId+" is : "+book.getBookName();
        }
        return "Book with Id "+bookId+" not found!!";
   }

    public Genre getGenreByBookName(String bookName){
        Genre genre =null;
        for (Book book:books){
            if (book.getBookName().equalsIgnoreCase(bookName)){
                genre=book.getGenre();
            }
        }
        if (genre!=null) System.out.println("The Genre of the book "+bookName+" is : "+genre);
        else System.out.println( "Book "+bookName+" not found");
        return genre;
    }

    public String  getAuthorNameByBookName(String bookName){
        String authorName=null;
        for (Book book : books){
            if (book.getBookName().equalsIgnoreCase(bookName)){
                authorName=book.getAuthorName();
            }
        }
        if (authorName!=null) return "The Author name of the book "+bookName+" is : "+authorName;
        else return "Book "+bookName+" not found";
    }

    public String getPublisherNameByBookId(int bookId){
        String publisherName=null;
        for (Book book:books){
            if (book.getBookId()==bookId){
                publisherName=book.getPublisherName();
            }
        }
        if (publisherName!=null) return "The publisher name of the book with Id "+bookId+" is : "+publisherName;
        return "Book with Id "+bookId+" not found";
    }

    public String getPublisherNameByBookName(String bookName){
        String publisherName=null;
        for (Book book:books){
            if (book.getBookName().equalsIgnoreCase(bookName)){
                publisherName=book.getPublisherName();
            }
        }
        if (publisherName!=null) return "The publisher name of the book "+bookName+" is : "+publisherName;
        return "Book "+bookName+" not found";
    }

    public int getPublishedYearByBookName(String bookName){
        int publishedYear=0;
        for (Book book:books){
            if (book.getBookName().equalsIgnoreCase(bookName)){
                publishedYear=book.getPublishedYear();
            }
        }
        if (publishedYear!=0) System.out.println("The publisher name of the book "+bookName+" is : "+publishedYear);
        else System.out.println("Book "+bookName+" not found");
        return publishedYear;
    }

    public int getPublishedYearByBookId(int bookId){
        int publishedYear=0;
        for (Book book:books){
            if (book.getBookId()==bookId){
                publishedYear=book.getPublishedYear();
            }
        }
        if (publishedYear!=0) System.out.println("The publisher name of the book with Id "+bookId+" is : "+publishedYear);
        else System.out.println("Book with Id "+bookId+" not found");
        return publishedYear;
    }

    public boolean deleteBookById(int bookId){
        boolean isBookDeleted=false;
        int length=books.length;
        for (int i = 0; i <books.length ; i++) {
            if (books[i].getBookId()==bookId){
                for(int j=i;j<books.length-1;j++){
                    books[j]=books[j+1];
                }
                books[books.length-1]=null;
                length--;
                isBookDeleted=true;
                break;
            }
        }
        if (isBookDeleted!=false) System.out.println("Book with Id "+bookId+" is deleted");
        else System.out.println("Book with Id "+bookId+" not found");
        return isBookDeleted;
    }

    public  Book getBookInfoById(int bookId){
        Book book=null;
        for (Book book1:books){
            if (book1.getBookId()==bookId){
                book=book1;
            }
        }
        if (book!=null) return book;
        else System.out.println("Book with Id "+bookId+" not found!!");
        return null;
    }

    public void displayBookInfo(Book book){
        if (book!=null) {
            System.out.println("Book Id is : " + book.getBookId());
            System.out.println("Book Name is : " + book.getBookName());
            System.out.println("Genre of the book is : " + book.getGenre());
            System.out.println("Author of the book is : " + book.getAuthorName());
            System.out.println("Publisher of the book is : " + book.getPublisherName());
            System.out.println("Published year of the book is : " + book.getPublishedYear());
            System.out.println("-------------------------------------------------------------------");
        }
    }
    public void getALlBooksDetails(){
        System.out.println("Books Details are :");
        System.out.println();
        for (Book book : books) {
            if (book!=null) {
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
}
