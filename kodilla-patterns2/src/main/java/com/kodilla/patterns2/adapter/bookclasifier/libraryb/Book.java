package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public Book(final String author, final String title, final int publicationYear) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}