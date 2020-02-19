package com.kodilla.kodillapatterns2.bookclasifier;

import com.kodilla.kodillapatterns2.bookclasifier.libraryb.BookSiganture;
import com.kodilla.kodillapatterns2.bookclasifier.libraryb.BookStatistics;
import com.kodilla.kodillapatterns2.bookclasifier.libraryb.BookToMap;
import com.kodilla.kodillapatterns2.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {
    @Override
    public int averagePublicationYear(Map<BookSiganture, BookToMap> books){
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }
    @Override
    public int medianPublicationYear(Map<BookSiganture, BookToMap> books){
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
