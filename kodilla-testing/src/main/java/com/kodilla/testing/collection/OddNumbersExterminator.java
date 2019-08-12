package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    ArrayList<Integer> evenList;
    ArrayList<Integer> oddList;
    OddNumbersExterminator(){
        evenList = new ArrayList<Integer>();
        oddList = new ArrayList<Integer>();
    }
    public void exterminate(ArrayList<Integer> list){
        for(Integer temp: list)
        {
            if (temp % 2 == 0){
                oddList.add(temp);
                System.out.println(temp);
            }
            else{
                evenList.add(temp);
            }
        }
    }
}
