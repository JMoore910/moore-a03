package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
	Create an application that prompts the user to input a list of numbers
	separated by spaces. The input string is then split into a list by the
	program for processing. The new list is evaluated by the application,
	which checks every value in the list to be even (value % 2 == 0)
	in a for each loop
		if value is even
			evens.add(value)
	program then loops through the evens list and prints out all contents.
*/


public class Solution38 {


    public static void main(String[] args) {
        FindEvenNumbers evens = new FindEvenNumbers();
        evens.findEvens();
    }
}
