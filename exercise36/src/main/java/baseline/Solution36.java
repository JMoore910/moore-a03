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

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Solution36 {
    //Make Scanner public static final here for all methods in class to use
    public static final Scanner input = new Scanner(System.in);


    public static double average(ArrayList<Integer> numList) {
        //      use for each loop:
        double avg=0;
        double count=0;
        for (int i : numList) {
            avg += i;
            count++;
        }
        return avg/count;
    }

    public static int max(ArrayList<Integer> numList) {
        //      use for each loop:
        int max = 0;
        for (int i : numList) {
            if (max < i)
                max = i;
        }
        return max;
    }

    public static int min(ArrayList<Integer> numList) {
        //      use for each loop:
        int min = MAX_VALUE;
        for (int i : numList) {
            if (min > i)
                min = i;
        }
        return min;
    }


    public static double std(ArrayList<Integer> numList, double avg) {
        //      use for each loop:
        double sum = 0;
        for (int i: numList)
            sum += pow(i-avg, 2);
        return sqrt(sum / numList.size());
    }


    public static ArrayList<Integer> inputList(ArrayList<Integer> numList) {
        //      use while loop
        String numIn;
        while (true) {
            System.out.printf("Enter a number: ");
            numIn = input.nextLine();
            if ((numIn.matches("[0-9]+")) && (numIn.length()!=0))
                numList.add(parseInt(numIn));
            //Ensure the list is not empty. Trap user in loop until at least one number is given
            else if ((numIn.equals("done")) && (numList.size()!=0))
                return numList;
        }
    }

    public static void printValues(ArrayList<Integer> numList, int min, int max, double avg, double std) {
        System.out.printf("Numbers: ");
        for (int i: numList)
            System.out.printf("%d, ",i);
        System.out.printf("%nThe average is %.2f.",avg);
        System.out.printf("%nThe minimum is %d", min);
        System.out.printf("%nThe maximum is %d", max);
        System.out.printf("%nThe standard deviation is %.2f.",std);
    }

    public static void main(String[] args) {
        //  Receive input and store it as an ArrayList
        int max, min;
        double avg, std;
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList = inputList(numList);
        //  Calculate Average, maximum, and minimum
        //  then use average to calculate standard deviation
        avg = average(numList);
        max = max(numList);
        min = min(numList);
        std = std(numList, avg);
        printValues(numList, min, max, avg, std);
    }
}
