package com.kodilla.good.patterns.challenges;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.*;

public class MovieStoreMain {
    public static void main (String args[]){
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getMovies().entrySet().stream().map(entry -> entry.getValue()).flatMap(list-> list.stream()).collect(Collectors.joining("!")));
    }
}
