package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class MovieStoreMain {
    public static void main (String args[]){
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getMovies().entrySet().stream().map(entry -> entry.getValue()).flatMap(list-> list.stream()).map(s -> s.toUpperCase()).collect(Collectors.joining("!")));
    }
}
