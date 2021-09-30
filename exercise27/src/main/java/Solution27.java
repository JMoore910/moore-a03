/*
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
import java.lang.Character;

public class Solution27 {
    //  Create Functions:


    public static String firstNameValidation(String firstName, String outputString) {
        if (firstName.length() < 2) {
            //  concatenate "The first name must be at least 2 characters long.  \n" to OutputString
            outputString = outputString.concat("The first name must be at least 2 characters long. \n");
        }
        return outputString;
    }

    public static String lastNameValidation(String lastName, String outputString) {
        if (lastName.length() < 2) {
            //  concatenate "The last name must be at least 2 characters long.  \n" to OutputString
            outputString = outputString.concat("The last name must be at least 2 characters long. \n");
        }
        return outputString;
    }

    public static String filledNameValidation(String firstName, String lastName, String outputString) {
        if ((firstName.equals("")) || (lastName.equals(""))) {
            if(firstName.equals("")) {
                //  concatenate "The first name must be filled in.  \n" to OutputString
                outputString = outputString.concat("The first name must be filled in. \n");
            }
            if (lastName.equals("")) {
                //  concatenate "The last name must be filled in.  \n" to OutputString
                outputString = outputString.concat("The last name must be filled in.  \n");
            }
        }
        return outputString;
    }

    public static String zipCodeValidation(String zip, String outputString) {
        if ((!zip.matches("[0-9]+")) || (zip.length() != 5)) {
            //  concatenate "The zipcode must be a 5 digit number. \n" to OutputString
            outputString = outputString.concat("The zipcode must be a 5 digit number. \n");
        }
        return outputString;
    }

    public static String idFormatValidation(String id, String outputString) {
        if ((id.length() != 7) || (!Character.isLetter(id.charAt(0))) || (!Character.isLetter(id.charAt(1))) ||
                (!Character.isDigit(id.charAt(3))) || (!Character.isDigit(id.charAt(4))) ||
                (!Character.isDigit(id.charAt(5))) || (!Character.isDigit(id.charAt(6))) || !(id.charAt(2) == '-')) {
            //  concatenate "The employee ID must be in the format of AA-1234. \n"  to OutputString
            outputString = outputString.concat("The employee ID must be in the format of AA-1234. \n");
        }
        return outputString;
    }

    public static String validateInput(String firstName, String lastName, String zip, String id) {
        String outputString = new String("");
        outputString = firstNameValidation(firstName, outputString);
        outputString = lastNameValidation(lastName, outputString);
        outputString = filledNameValidation(firstName, lastName, outputString);
        outputString = zipCodeValidation(zip, outputString);
        outputString = idFormatValidation(id, outputString);
        if (outputString.equals("")) {
            //  concatenate "There were no errors. \n" to OutputString
            outputString = outputString.concat("There were no errors. \n");
        }
        return outputString;
    }

    public static void main(String[] args) {
        //  prompt for user to input firstName, lastName, zip, and employee ID
        //  Get user input for firstName, lastName, zip, and employee ID
        Scanner input = new Scanner(System.in);
        String firstName, lastName, zip, id;
        System.out.printf("Enter the first name: ");
        firstName = input.nextLine();
        System.out.printf("Enter the last name: ");
        lastName = input.nextLine();
        System.out.printf("Enter the ZIP code: ");
        zip = input.nextLine();
        System.out.printf("Enter the employee ID: ");
        id = input.nextLine();
        //  pass the input values into validateInput, and let the functions do the rest
        String output = validateInput(firstName,lastName,zip,id);
        //print OutputString as a single output statement
        System.out.println(output);
    }
}
