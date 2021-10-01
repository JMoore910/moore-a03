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
		if (value % 2 == 0)
			evens.add(value)
	program then loops through the evens list and prints out all contents.
*/

public class Solution38 {
    //  Make Scanner public static final for any methods who need it

    //  Create method: public static String getUserInput
    //	prompt user to input a list of numbers separated by spaces
    //	String nums;
    //	boolean valid = false;
    //	while (!valid)
    //		nums = input.nextLine()
    //		valid = inputValidation(nums)
    //	return nums;


    //  Create method: public static boolean inputValidation(String nums)
    //	if (!input.matches("[0-9 ]+)")
    //		print: Please give only numbers and spaces in your input
    //		return false;
    //	return true;


    //  Create method: public static List<String> findEvens(String nums)
    //	List<String> evens = new List<>();
    //	List<String> numList;
    //	numList = Arrays.asList(nums.split("\\s*"));   //MAY BE "\s*" or "\\s" INSTEAD
    //	for (String str : numList)
    //		if (parseInt(str) % 2 == 0)
    //			evens.add(str);
    //	return evens;


    //  Create method: public static void printList(List<String> list)
    //	print: "The even numbers are: "
    //	for (String str : list)
    //		print: str + " "
    //	print: "."


    public static void main(String[] args) {
        //	String nums = getUserInput();
        //	List<String> evens = new List<>();
        //	evens = findEvens(nums);
        //	printList(evens)
    }
}
