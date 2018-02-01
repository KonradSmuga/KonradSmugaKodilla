package com.kodilla.exception.test;

public class FirstChallenge {

<<<<<<< HEAD
    private double divide(double a, double b) throws ArithmeticException {
=======

    public double divide(double a, double b) throws ArithmeticException {
>>>>>>> 98c1b25624fa17c47d5552ff811db0882cf49bc0
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();
<<<<<<< HEAD

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero");

        } finally {
            System.out.println("Koniec dzialania");
        }
    }
}
=======
        try {
        double result = firstChallenge.divide(3, 0);
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.out.println("Dzielenie nie powiodlo się " +e);
        } finally {
            System.out.println("Nie dzielimy przez 0 ");
        }
    }
}
>>>>>>> 98c1b25624fa17c47d5552ff811db0882cf49bc0
