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
    //stringCompare
    //Create a function that compares two strings to see if they are anagrams
    //Create method: stringCompare(String A, String B)
    public static boolean stringCompare(String A, String B){
        boolean anagram = true;
        /*ADDITION TO PSEUDOCODE: Due to the fact for-each loops cannot be applied to Strings,
        two arrays of chars must be created and copied from the input strings*/
        if (A.length()==B.length()){
            char[] arrA, arrB;
            arrA = new char[A.length()];
            arrB = new char[B.length()];
            for (int i = 0;i<A.length();i++){
                //Copy the char array for each from it's corresponding string
                arrA[i] = A.charAt(i);
                arrB[i] = B.charAt(i);
            }

            //Now that the char arrays are created, the procedure to figure out whether they are anagrams should be this
            //for each (char i : arrA){
            //boolean found = false
            //  for each (char j : arrB){
            //      if !found
            //      if i == j,
            //          i = ''
            //          found = true
            //      if !found {anagram = false;}
            //the result should be that arrA will be totally null when arrB is finished

        } else {
            anagram = false;
        }

        //return a boolean flag anagram, //true if anagram, false if not anagram
        return anagram;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1,str2;
        //prompt for input from user
        //receive the two strings from User as input
        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        System.out.printf("Please enter the first string: ");
        str1 = input.nextLine();
        System.out.printf("Please enter the second string: ");
        str2 = input.nextLine();
        //call the stringCompare(str1,str2) within an if statement checking if true is returned
        if (stringCompare(str1,str2)) {
            //  print "the strings are anagrams"
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            //  print "the strings are not anagrams"
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
        }
    }
}
