package com.kodilla.testing.collection;

import java.lang.*;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public  ArrayList<Integer> exterminate(ArrayList<Integer> numbers){

        ArrayList<Integer> notEvenNumbers = new ArrayList<>();

        for(Integer number : numbers){
            if(number % 2 == 0){
                notEvenNumbers.add(number);
            }
        }
        return notEvenNumbers;
    }
}
