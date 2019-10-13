package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("Public Library");
        Book book1 = new Book("Rich dad pour dad","Robert Kiyosaki", LocalDate.of(2006, 10, 25));
        Book book2 = new Book("Think and grow rich","Napoleon Hill", LocalDate.of(1930, 8, 12));
        Book book3 = new Book("The power of your subconscious mind","Joseph Murphy", LocalDate.of(1985, 6, 21));
        Book book4 = new Book("The art of setting goals","Brian Tracy", LocalDate.of(2009, 3, 27));
        Book book5 = new Book("Success and change","Mateusz Grzesiak", LocalDate.of(2014, 1, 13));
        Book book6 = new Book("How to care of your money","Marcin Iwuc", LocalDate.of(2014, 2, 5));
        Book book7 = new Book("Why we want you to be rich","Robert Kiyosaki", LocalDate.of(1997, 7, 9));
        Book book8 = new Book("Eat that frog","Brian Tracy", LocalDate.of(2009, 10, 10));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);
        library.getBooks().add(book8);

        Library shallowClonedLibrary = null;
        try{
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("UWr Library");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try{
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("PWr library");
        } catch (CloneNotSupportedException e )
        {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book5);
        library.getBooks().remove(book3);
        System.out.println(library.toString());
        System.out.println(shallowClonedLibrary.toString());
        System.out.println(deepClonedLibrary.toString());
        //Then
        Assert.assertEquals(6, library.books.size());
        Assert.assertEquals(6, shallowClonedLibrary.books.size());
        Assert.assertEquals(8, deepClonedLibrary.books.size());
    }
}
