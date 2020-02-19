package com.kodilla.kodillapatterns2.bookclasifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSiganture, BookToMap> books);
    int medianPublicationYear(Map<BookSiganture, BookToMap> books);
}
