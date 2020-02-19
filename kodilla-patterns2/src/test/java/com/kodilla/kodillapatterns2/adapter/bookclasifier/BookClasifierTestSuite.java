package com.kodilla.kodillapatterns2.adapter.bookclasifier;

import com.kodilla.kodillapatterns2.bookclasifier.MedianAdapter;
import com.kodilla.kodillapatterns2.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BookClasifierTestSuite {
    @Test
    public void testMedianYearOfPublication(){
        //Given
        Book book1 = new Book("Author1", "Title1", 1992, "1");
        Book book2 = new Book("Author2", "Title2", 1993, "2");
        Book book3 = new Book("Author3", "Title3", 1994, "3");
        Book book4 = new Book("Author4", "Title4", 1995, "4");
        Book book5 = new Book("Author5", "Title5", 1996, "5");
        Set<Book> books = new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        Assert.assertEquals(1994, median);
    }
}
