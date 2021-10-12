package baseline;/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Sean Moore
 */

/*
    Create an application that takes 5 integers as input,
    and uses repetition via a counting loop to add them together
    and prints the sum as output to the user
    Create a function: Loop function, returns integer sum
 */

import java.util.Scanner;

public class Solution28 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        Calculator addition = new Calculator();
        //enter for loop iterating 5 times
        for (int i=0;i<5;i++){
            //prompt user for integer as input
            System.out.print("Enter a number: ");
            //Get input as num
            num = input.nextInt();
            //call calculate sum function within loop
            sum = addition.calculateSum(num, sum);
        }
        System.out.println("The total is " + sum + ".");
    }
}
