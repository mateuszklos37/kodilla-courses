package com.kodilla.spring.reader;

public final class Reader {
    private Book book;
    private Book book2;

    public Reader(Book book, Book book2){
        this.book = book;
        this.book2 = book2;
    }

    public void read(){
        System.out.println("Reading: " + book.getTitle() + ", as next: " + book2.getTitle());
    }

    public String getBook() {
        return book.getTitle();
    }

    public String getBook2() {
        return book2.getTitle();
    }
}
