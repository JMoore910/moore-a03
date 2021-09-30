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

public class Solution27 {
    //Create Functions:


    //private String firstNameValidation(String firstName, String OutputString)
    //  if firstName.length < 2,
    //      concatenate "The first name must be at least 2 characters long.  \n" to OutputString
    //  return OutputString


    //private String lastNameValidation(String lastName, String OutputString)
    //  if lastName.length < 2,
    //      concatenate "The last name must be at least 2 characters long.  \n" to OutputString
    //  return OutputString


    //private String filledNameValidation(String firstName, String lastName, String OutputString)
    //  if firstName.equals("") or lastName.equals(""),
    //      if firstName.equals(""),
    //          concatenate "The first name must be filled in.  \n" to OutputString
    //      if lastName.equals(""),
    //          concatenate "The last name must be filled in.  \n" to OutputString
    //  return OutputString


    //private String zipCodeValidation(String zip, String OutputString)
    //  if zip is not all digits or zip.length != 5,       //Syntax: !zip.matches("[0-9]+")
    //      concatenate "The zipcode must be a 5 digit number. \n" to OutputString
    //  return OutputString


    //private String idFormatValidation(String id, String OutputString)
    //  if the id is not 7 chars long, or the first two chars aren't digits, or the last four chars aren't all uCase letters, or the third char is not a hyphen,
    //      Syntax:if id.length != 7 or !id.substring(0,1).matches("[0-9]+") or !id.substring(3,6).matches("[A-Z]+") or !id.charAt(2).equals('-')
    //      concatenate "The employee ID must be in the format of AA-1234. \n"  to OutputString
    //  return OutputString


    //public void validateInput(String firstName, String lastName, String zip, String iD)
    //  String OutputString;
    //  OutputString = firstNameValidation(firstName, OutputString);
    //  OutputString = lastNameValidation(lastName, OutputString);
    //  OutputString = filledNameValidation(firstName, OutputString);
    //  OutputString = zipCodeValidation(zip, OutputString);
    //  OutputString = idFormatValidation(id, OutputString);
    //  if OutputString.equals(""), concatenate "There were no errors. \n" to OutputString
    //  print OutputString

    public static void main(String[] args) {
        //  prompt for user to input firstName, lastName, zip, and employee ID
        //  Get user input for firstName, lastName, zip, and employee ID
        //  pass the input values into validateInput, and let the functions do the rest
    }
}
