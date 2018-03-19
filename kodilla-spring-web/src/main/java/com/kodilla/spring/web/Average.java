package com.kodilla.spring.web;

import java.util.List;

public class Average {

    public Double calculateAverage(List<Double> notes) {
        double sum = 0;
        for (Double note : notes) {
            sum += note;
        }
            return sum/notes.size();
    }
}
