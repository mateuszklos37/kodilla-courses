package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

import java.util.HashMap;


public class TestingMain {
    public static void main(String[] args){
        HashMap<Integer, String> theMap = new HashMap<>();
        theMap.put(2, "2");
        theMap.put(2, "20");

        System.out.println(theMap.get(2));
        System.out.println(theMap.size());
    }
}
