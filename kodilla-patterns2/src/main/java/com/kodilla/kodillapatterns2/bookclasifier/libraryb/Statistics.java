package com.kodilla.kodillapatterns2.bookclasifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistics implements BookStatistics{
    @Override
    public int averagePublicationYear(Map<BookSiganture, BookToMap> books){
        if(books.size() ==0) return 0;
        int sum = 0;
        for(Map.Entry<BookSiganture, BookToMap> entry: books.entrySet()){
            sum += entry.getValue().getYearOfPublication();
        }
        return sum/books.size();
    }
    @Override
    public int medianPublicationYear(Map<BookSiganture, BookToMap> books){
        if(books.size() ==0) return 0;
        int[] years = new int[books.size()];
        int n=0;
        for(Map.Entry<BookSiganture, BookToMap> entry: books.entrySet()){
            years[n] = entry.getValue().getYearOfPublication();
            n++;
        }
        Arrays.sort(years);
        if (years.length%2 ==0){
            return years[(int)(years.length/2 + 0.5)];
        } else{
            return years[years.length/2];
        }
    }
}
