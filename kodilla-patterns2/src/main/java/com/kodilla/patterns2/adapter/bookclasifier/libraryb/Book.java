package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPrublication;

    public Book(String author, String title, int yearOfPrublication) {
        this.author = author;
        this.title = title;
        this.yearOfPrublication = yearOfPrublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPrublication() {
        return yearOfPrublication;
    }
}
