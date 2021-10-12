package baseline;/*
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


    public static void main(String[] args) {
        int strength;
        String password;
        String output;
        Scanner input = new Scanner(System.in);

        //prompt for a string to be input and receive input
        System.out.println("Please enter a password to check strength: ");
        password = input.nextLine();

        Password passObj = new Password();

        //pass the string into password validator and assign returned statement to an int strength
        strength = passObj.passwordValidator(password);

        //use a switch function to assign a string a rating based on int strength [0-4]
        output = switch (strength) {
            case 1 -> "very weak";
            case 2 -> "weak";
            case 3 -> "strong";
            case 4 -> "very strong";
            default -> "unknown strength";
        };
        //with output concatenate strength to the end of output to describe password in a single output statement
        System.out.println("The password '" + password + "' is a " + output + " password.");
    }
}
