package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that uses multiple functions to calculate
    an input integer array's minimum, maximum, standard deviation,
    and average.
    Create method:
    -   public static double average(ArrayList<int> numList)
    -   public static int max(ArrayList<int> numList)
    -   public static int min(ArrayList<int> numList)
    -   public static double std(ArrayList<int> numList)
    -   public static ArrayList<int> inputList()
 */

public class Solution36 {


    public static void main(String[] args) {
        Calculator stdCalc = new Calculator();
        stdCalc.runCalculator();
    }
}
