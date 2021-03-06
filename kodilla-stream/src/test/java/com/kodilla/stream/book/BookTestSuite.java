package com.kodilla.stream.book;
import java.util.List;
import java.util.stream.IntStream;

import org.junit.Assert;
import org.junit.Test;

public class BookTestSuite {
    @Test
    public void testGetListUsingFor(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book: books){
            if(book.getYearOfPublication()>2007){
                numberOfBooksPublicatedAfter2007 +=1;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
    @Test
    public void testGetListUsingIntStream(){
        //Given
        BookDirectory bookDirectory = new BookDirectory();
        //When
        List<Book> books = bookDirectory.getList();
        long numberOfBooksPublicatedAfter2007 = 0;
        //Then
        numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                .filter(n -> books.get(n).getYearOfPublication()>2007)
                .count();
                Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
    }
}
