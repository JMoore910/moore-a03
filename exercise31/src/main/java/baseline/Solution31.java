package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that creates a heartrate table
    that uses a given formula to find your heartrate at
    a specific exertion intensity based on Resting Pulse
    and age, which are given as input from the user
    Create methods:
    public static boolean validateInput(double rest, int age)
    public static void printTable(double rest, int age)
    public static double calculateTarget(double rest, double intensity, int age)
    method should use a loop to cycle from 55% to 95%
    and print out a table
 */

public class Solution31 {

    //  Create Method: public static void printTable(double rest, int age)
    //  printline: "Intensity    | Rate"
    //  printline: "-------------|--------"
    //  double percent, target;
    //  for (percent = 55; percent <= 95; percent += 5)
    //      target = calculateTarget(rest, percent/100, age)
    //      printline: percent + "%          | " + target + "bpm"


    //  Create Method: public static double calculateTarget(double rest, double intensity, int age)
    //  return (((220 - age) - rest) * intensity) + rest;


    //  Create Method: public static boolean validateInput(String rest, String age)
    //  if rest is not a number or age is not a number,
    //      return false;
    //  else,
    //      return true;

    public static void main(String[] args) {
        //  boolean valid = false;
        //  String restIn, ageIn;
        //  double rest;
        //  int age;
        //  restIn = "";
        //  ageIn = "";
        //  Enter input validation loop: while(!valid)
        //    Prompt for user to input resting pulse and age
        //    pass the input strings into input validation method
        //    valid = validateInput(restIn, ageIn)
        //    if (!valid)
        //        printline "Please enter resting pulse and age as numeric values."
        //  After exiting loop, parseInt and parseDouble to turn input into respective types
        //  rest = parseDouble(restIn);
        //  age = parseInt(ageIn);
        //  rest and age are then passed into printTable function
        //  printTable(rest,age);
    }
}
