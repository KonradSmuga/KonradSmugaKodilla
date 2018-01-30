package com.kodilla.exception.test;


public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {

        }
        try {
            return a / b;

        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        } finally {
            System.out.println("try to not divide by 0!");
        }
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}

/*
 }
 */