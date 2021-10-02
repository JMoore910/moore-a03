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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Solution38 {
    //  Make Scanner public static final for any methods who need it
    public static final Scanner input = new Scanner(System.in);

    public static String getUserInput() {
        //	prompt user to input a list of numbers separated by spaces
        String nums = "";
        boolean valid = false;
        while (!valid) {
            System.out.printf("Enter a list of numbers, separated by spaces: ");
            nums = input.nextLine();
            valid = inputValidation(nums);
        }
        return nums;
    }

    public static boolean inputValidation(String nums) {
        if (!nums.matches("[0-9 ]+")) {
            System.out.printf("Please give only numbers and spaces in your input ");
            return false;
        }
        return true;
    }

    public static ArrayList<String> findEvens(String nums) {
        ArrayList<String> evens = new ArrayList<>();
        List<String> numList;
        numList = Arrays.asList(nums.split("\\s"));   //MAY BE "\s*" or "\\s" INSTEAD
        for (String str : numList) {
            if (parseInt(str) % 2 == 0)
                evens.add(str);
        }
        return evens;
    }


    public static void printList(ArrayList<String> list) {
        System.out.printf("The even numbers are:");
        for (String str : list)
            System.out.printf(" %s",str);
        System.out.println(".");
    }

    public static void main(String[] args) {
        String nums = getUserInput();
        ArrayList<String> evens = new ArrayList<>();
        evens = findEvens(nums);
        printList(evens);
    }
}
