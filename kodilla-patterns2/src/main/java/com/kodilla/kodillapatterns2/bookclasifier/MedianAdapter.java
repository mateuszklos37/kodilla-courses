package com.kodilla.kodillapatterns2.bookclasifier;

import com.kodilla.kodillapatterns2.bookclasifier.librarya.Book;
import com.kodilla.kodillapatterns2.bookclasifier.librarya.Classifier;
import com.kodilla.kodillapatterns2.bookclasifier.libraryb.BookSiganture;
import com.kodilla.kodillapatterns2.bookclasifier.libraryb.BookToMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet){
        Map<BookSiganture, BookToMap> bookMap = new HashMap<>();
        for(Book book: bookSet){
            BookSiganture signature = new BookSiganture(book.getSignature());
            BookToMap bookToMap = new BookToMap(book.getAuthor(), book.getTitle(), book.getPublicationYear());
            bookMap.put(signature, bookToMap);
        }
        return medianPublicationYear(bookMap);
    }
}
