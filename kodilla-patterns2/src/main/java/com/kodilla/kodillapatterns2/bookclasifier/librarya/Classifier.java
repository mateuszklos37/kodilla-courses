package com.kodilla.kodillapatterns2.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
