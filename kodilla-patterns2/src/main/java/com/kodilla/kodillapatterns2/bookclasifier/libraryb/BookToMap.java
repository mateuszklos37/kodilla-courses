package com.kodilla.kodillapatterns2.bookclasifier.libraryb;

public class BookToMap {
    private final String author;
    private final String title;
    private final int yearOfPublication;

    public BookToMap(String author, String title, int yearOfPublication) {
        this.author = author;
        this.title = title;
        this.yearOfPublication = yearOfPublication;
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
