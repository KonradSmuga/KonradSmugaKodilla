package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 3);

        } catch (Exception e) {
            System.out.println("problem with numbers, provided numbers are not allowed");
        } finally {
            System.out.println("Done");
        }

    }
}