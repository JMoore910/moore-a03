package baseline;

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

    public static void main(String[] args) {
        //  initialize boolean valid = false
        boolean valid = false;
        String rate = "";
        Scanner input = new Scanner(System.in);
        //  While loop:
        Calculator returnCalc = new Calculator();
        while (!valid) {
            //  Prompt for user to input rate of return
            System.out.print("What is the rate of return? ");
            rate = input.nextLine();
            valid = returnCalc.validateInput(rate);
        }
        int returnTime = returnCalc.calculateReturn(parseInt(rate));
        //print "It will take " + returnTime + " to double your initial investment."
        System.out.println("It will take " + returnTime + " years to double your initial investment.");
    }
}
