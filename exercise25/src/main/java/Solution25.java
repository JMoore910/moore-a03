/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that prompts for and receives a string of characters
    and checks how strong that string would be as a password
    very weak: String contains only numbers                              fewer than 8 characters
    weak: String contains only letters                                   fewer than 8 characters
    strong: String contains letters and at least one number                at least 8 characters
    very strong: String contains letters, numbers, and special characters  at least 8 characters
 */

import java.util.Scanner;

public class Solution25 {
    public static int passwordValidator(String A) {
        if (A.length() < 8) {
            //string is less than 8 characters
            //strength is either very weak, weak, or unknown(less than 8 but mix of chars)

            //password is purely numeric, return 1 (very weak)
            if (A.matches("[0-9]+"))
                return 1;

            //password is purely letters , return 2 (weak)
            else if (A.matches("[a-zA-Z]+"))
                return 2;

            //neither case is met, return 0 (unknown)
            else
                return 0;
        } else {
            //more than 8 characters
            //strength is either strong, very strong, or unknown
            int numCount=0, alphaCount=0, specCount=0;
            //use .isDigit and .isAlphabetic to find the count of letters, numbers, and special characters
            for (int i = 0; i < A.length(); i++) {
                         if (Character.isDigit(A.charAt(i)))
                             numCount++;
                         else if (Character.isAlphabetic(A.charAt(i)))
                             alphaCount++;
                         else
                             specCount++;
            }
            //password contains at least one number, letters, no special chars, return 3 (strong)
            if (alphaCount > 0 && numCount > 0 && specCount == 0)
                return 3;

            //password contains at least one of each type of char, return 4 (very strong)
            else if (alphaCount > 0 && numCount > 0 && specCount > 0)
                return 4;

            //password contains only one type of char, return 0 (unknown)
            else
                return 0;

        }
    }

    public static void main(String[] args) {
        int strength;
        String password;
        String output;
        Scanner input = new Scanner(System.in);

        //prompt for a string to be input and receive input
        System.out.printf("Please enter a password to check strength: ");
        password = input.nextLine();

        //pass the string into password validator and assign returned statement to an int strength
        strength = passwordValidator(password);

        //use a switch function to assign a string a rating based on int strength [0-4]
        switch (strength) {
            case 1:
            output = "very weak";
            break;

            case 2:
            output = "weak";
            break;

            case 3:
            output = "strong";
            break;

            case 4:
            output = "very strong";
            break;

            default:
            output = "unknown strength";
            break;
        }
        //with output concatenate strength to the end of output to describe password in a single output statement
        System.out.println("The password '" + password + "' is a " + output + " password.");
    }
}
