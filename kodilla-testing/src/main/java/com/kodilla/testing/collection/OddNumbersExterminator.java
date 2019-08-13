package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> list){
        ArrayList <Integer> resultList = new ArrayList<Integer>();
        for(Integer temp: list)
        {
            if (temp % 2 == 0) {
                resultList.add(temp);
            }
        }
        return resultList;
    }
}
