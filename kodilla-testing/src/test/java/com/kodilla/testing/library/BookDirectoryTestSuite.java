package com.kodilla.testing.library;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookDirectoryTestSuite {
    @Test
    public void testListBookWithConditionsReturnList() {
        //Given
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabase.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);
        //When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");
        //Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBookWithConditionMoreThan20() {
        LibraryDatabase libraryDatabase = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabase);
        List <Book> resultListOf0Books = new ArrayList<Book>();
        List <Book> resultListOf15Books = generateListOfNBooks(15);
        List <Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabase.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabase.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabase.listBooksWithCondition("FortyBooks")).thenReturn(resultListOf40Books);
        //when
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
        //then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(40, theListOfBooks40.size());
    }

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<Book>();
        for (int i=0; i<booksQuantity; i++){
            Book theBook = new Book ("Title" + i,"Author" +i, 1970 +i);
            resultList.add(theBook);
        }
        return resultList;
    }
}
