package com.kodilla.stream.array;

import java.util.stream.IntStream;

public class Asd {
   public   double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .forEach(System.out::print);
        double average = IntStream.range(1, numbers.length)
                .mapToDouble(k -> numbers[k])
                .average()
                .getAsDouble();

        return average;
    }
}