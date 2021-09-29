/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that helps you determine the amount of time in months
    you have left before your credit card is fully paid off, when its balance reaches
    zero.
    prompt for USER to input card's APR then take it as a percentage, not a decimal
    Use a class PaymentCalculator and give it a public method called calculateMonthsUntilPaidOff()
    method takes no parameters and returns the number of months
    fractions of cents should be rounded uo to the next cent for internal calculations
*/

import java.util.Scanner;
import static java.lang.Math.ceil;

public class Solution26 {
    public static void main(String[] args) {
        //get user input for balance, APR as a percentage, and payPerMonth
        Scanner input = new Scanner(System.in);
        double bal,apr,pay,numMonths;
        System.out.printf("Please enter credit card balance: ");
        bal = input.nextDouble();
        System.out.printf("Please enter credit card APR: ");
        apr = input.nextDouble();
        System.out.printf("Please enter the amount you can pay per month: ");
        pay = input.nextDouble();

        //divide APR by 100 first to get it as a decimal,
        apr /= 100;
        System.out.println(apr);

        //then divide APR by 365 to get the daily rate on the card.
        apr /= 365;
        //Construct an object of type PaymentCalculator
        PaymentCalculator clerk = new PaymentCalculator(apr,bal,pay);
        //use the class setters to give all of the input to the object and then make it
        //run its calculateMonthsUntilPaidOff method
        numMonths = clerk.calculateMonthsUntilPaidOff();
        numMonths = ceil(numMonths);
        System.out.println("The amount of time it would take to pay off everything is " + String.format("%.0f",numMonths));
        //return the result as a part of the output
    }
}
