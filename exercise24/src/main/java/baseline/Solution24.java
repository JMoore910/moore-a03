package baseline;

/*
 *   UCF COP3330 Fall 2021 Assignment 3 Solutions
 *   Copyright 2021 Sean Moore
 */

//import statements
import java.util.Scanner;

/*
    Create a program that compares two strings to see if they are anagrams
 */

public class Solution24 {
    //Sonar Lint issues are all to replace System.out with loggers

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1;
        String str2;
        //prompt for input from user
        //receive the two strings from User as input
        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        System.out.println("Please enter the first string: ");
        str1 = input.nextLine();
        System.out.println("Please enter the second string: ");
        str2 = input.nextLine();

        Compare comp = new Compare();
        //call the stringCompare(str1,str2) within an if statement checking if true is returned
        if (comp.stringCompare(str1,str2)) {
            //  print "the strings are anagrams"
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            //  print "the strings are not anagrams"
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
}
