package com.xworkz.libraryapp.book;


import com.xworkz.libraryapp.constants.Genre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Book {

    private int bookId;
    private String bookName;
    private Genre genre;
    private String authorName;
    private String publisherName;
    private int publishedYear;

//    public void setBookId(int bookId){
//        this.bookId=bookId;
//    }
//
//    public void setBookName(String bookName){
//        this.bookName=bookName;
//    }
//
//    public void setGenre(String genre){
//        this.genre=genre;
//    }
//
//    public void setAuthorName(String authorName){
//        this.authorName=authorName;
//    }
//
//    public void setPublisherName(String publisherName){
//        this.publisherName=publisherName;
//    }
//
//    public void setPublishedYear(int publishedYear){
//        this.publishedYear=publishedYear;
//    }
//
//    public int getBookId(){
//        return bookId;
//    }
//
//    public String getBookName(){
//        return bookName;
//    }
//
//    public String getGenre(){
//        return genre;
//    }
//
//    public String getAuthorName(){
//        return authorName;
//    }
//
//    public String getPublisherName(){
//        return publisherName;
//    }
//
//    public int getPublishedYear() {
//        return publishedYear;
//    }
}
