package com.kodilla.testing.library;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BooksInHandsOfTestSuite {
    //test 1 - użytkownik nie ma książek
    @Test
    public void testNoneBooksInHands(){
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser antoniUser = new LibraryUser("Antoni", "Zuch", "92081923001");
        List<Book> listOfBooks = new ArrayList<Book>();
        when(libraryDatabase.listBooksInHandsOf(antoniUser)).thenReturn(listOfBooks);
        List <Book> resultList = bookLibrary.listBooksInHandsOf(antoniUser);
        Assert.assertEquals(0, resultList.size());
    }
    //Użytkownik ma 1 książkę
    @Test
    public void testOneBookInHands(){
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser antoniUser = new LibraryUser("Antoni", "Zuch", "92081923001");
        List<Book> listOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Millionaire Mind", "T. Harv Eker", 2010);
        listOfBooks.add(book1);
        when(libraryDatabase.listBooksInHandsOf(antoniUser)).thenReturn(listOfBooks);
        List <Book> resultList = bookLibrary.listBooksInHandsOf(antoniUser);
        Assert.assertEquals(1, resultList.size());
    }
    //Użytkownik ma 2 książki
    @Test
    public void testFiveBooksInHands(){
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        LibraryUser antoniUser = new LibraryUser("Antoni", "Zuch", "92081923001");
        List<Book> listOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Millionaire Mind", "T. Harv Eker", 2010);
        Book book2 = new Book("Rich Dad and Pour Dad", "Robert Kiyosaki", 2012);
        Book book3 = new Book("Success and Change", "Mateusz Grzesiak", 2011);
        Book book4 = new Book("Jak ogarnąć budżet domowy", "Marcin Iwuć", 2014);
        Book book5 = new Book("Think and Grow Rich", "Napoleon Hill", 1935);
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        listOfBooks.add(book4);
        listOfBooks.add(book5);
        when(libraryDatabase.listBooksInHandsOf(antoniUser)).thenReturn(listOfBooks);
        List <Book> resultList = bookLibrary.listBooksInHandsOf(antoniUser);
        Assert.assertEquals(5, resultList.size());
    }
}

