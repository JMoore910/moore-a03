package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that processes user input to generate a random password
    User must pass in three integers as input, the minimum password length, the
    number of random numbers that will be in the password, and the number of
    random special characters that will be in the password.

    Create a list with all possible characters of each type:
        specialList()
        numberList()
        letterList()
 */


public class Solution37 {

    public static void main(String[] args) {
        PasswordGenerator password = new PasswordGenerator();
        password.generatePassword();
    }
}
