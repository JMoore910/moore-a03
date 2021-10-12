package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that stores a list of 6 maps containing info of 1 employee each
    Once list has been built, ask user to input a string.
    Then the application will build a new list of employees whose first or last name contains
    the string specified by the user.
    The resulting list is then printed
 */


public class Solution40 {

    public static void main(String[] args) {
        EmployeeLister lister = new EmployeeLister();
        lister.runEmployeeLister();
    }
}