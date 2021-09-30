/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 first_name last_name
 */

/*
    Create an application that validates user input in ensuring proper input
    Create a number validating function which does not allow the user to input
    zero. It also makes sure the user cannot input non-numeric values. The function
    should use a loop to trap bad input
 */

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Solution29 {
    //Create a function: boolean validateInput (String number)
    public static boolean validateInput(String number) {
        //  if the string is not numeric or 0, input is invalid
        if (!number.matches("[0-9]+") || parseInt(number) == 0) {
            System.out.println("Sorry. That's not valid input.");
            return false;
        }
        else
            return true;
    }

    //Create a function: int calculateReturn (int rate)
    public static int calculateReturn(int rate) {
        int returnTime = 72/rate;
        if (72 % rate != 0) {
            //  if the rate divides unevenly into 72,
            //  round up a year by adding one
            returnTime ++;
        }
       return returnTime;
    }

    public static void main(String[] args) {
        //  initialize boolean valid = false
        boolean valid = false;
        String rate = "";
        Scanner input = new Scanner(System.in);
        //  While loop:
        while (!valid) {
            //  Prompt for user to input rate of return
            System.out.printf("What is the rate of return? ");
            rate = input.nextLine();
            valid = validateInput(rate);
        }
        int returnTime = calculateReturn(parseInt(rate));
        //print "It will take " + returnTime + " to double your initial investment."
        System.out.println("It will take " + returnTime + " years to double your initial investment.");
    }
}
