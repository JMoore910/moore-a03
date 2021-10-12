package baseline;/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Sean Moore
 */

/*
    Create an application that validates input from a user
    Create a function for each validation rule
    Create a function validateInput(String firstName, String lastName, String zip, String id)
    function checks if:
    firstName is at least 2 chars long and is not empty.
    lastName  "  "   "    "  "     "    "   "  "   "   .
    zip       is a 5 digit integer
    employeeID follows format AA-1234
    if any of the conditions above aren't met through rules functions, specify to user the error of their ways.
    validateInput passes the input through all validation rules
    validation rules will print out if specific input was invalid
    ValidateInput, if no errors occurred, will say so to the user.
 */

import java.util.Scanner;

public class Solution27 {
    public static void main(String[] args) {
        //  prompt for user to input firstName, lastName, zip, and employee ID
        //  Get user input for firstName, lastName, zip, and employee ID
        Scanner input = new Scanner(System.in);
        String firstName;
        String lastName;
        String zip;
        String id;
        System.out.print("Enter the first name: ");
        firstName = input.nextLine();
        System.out.print("Enter the last name: ");
        lastName = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        id = input.nextLine();
        //  pass the input values into validateInput, and let the functions do the rest
        InputValidation valid = new InputValidation();
        String output = valid.validateInput(firstName,lastName,zip,id);
        //print OutputString as a single output statement
        System.out.println(output);
    }
}
