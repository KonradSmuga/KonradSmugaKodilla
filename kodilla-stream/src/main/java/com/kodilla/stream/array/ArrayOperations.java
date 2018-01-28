package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static void getAverage(int[] numbers){
        int numberOfBooksPublicatedAfter2007 = IntStream.range(0, 20)
                .map(n -> 1)
                .sum();
    }

}
