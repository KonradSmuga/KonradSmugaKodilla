package com.kodilla.hibernate.manytomany.facade;

public class SearchFacadeException extends Exception {

    public static String ERR_COMPANY_NOT_FOUND = "There is no company with provided name";
    public static String ERR_EMPLOYEE_NOT_FOUND = "There is no employee with provided name";

    public SearchFacadeException (String message) {
        super(message);
    }
}
