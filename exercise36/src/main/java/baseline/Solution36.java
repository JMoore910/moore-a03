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
    //Make Scanner public static final here for all methods in class to use

    //  Create method: public static double average(ArrayList<int> numList)
    //      use for each loop:
    //      double avg=0, count=0;
    //      for (int i : numList)
    //          avg += i;
    //          count++;
    //      return avg/count;


    //  Create method: public static int max(ArrayList<int> numList)
    //      use for each loop:
    //      max = 0;
    //      for (int i : numList)
    //          if max < i,
    //              max = i
    //      return max


    //  Create method: public static int min(ArrayList<int> numList)
    //      use for each loop:
    //      min = 0;
    //      for (int i : numList)
    //          if min < i,
    //              min = i
    //      return min



    //  Create method: public static double std(ArrayList<int> numList, double avg)
    //      use for each loop:
    //      double sum = 0;
    //      for (int i: numList)
    //          sum += pow(i-avg, 2);
    //      return sqrt(sum / numList.size());


    //  Create method: public static ArrayList<int> inputList(ArrayList<int> numList)
    //      use while loop
    //      String numIn;
    //      while (1)
    //          print: Enter a number:
    //          numIn = input.nextLine();
    //          if ((numIn.matches("[0-9]+")) && (numIn.length()!=0))
    //              numList.add(parseInt(numIn));
    //          else if (numIn.equals("done"))
    //              break;


    //  Create method: public static void printValues(ArrayList<int> numList, int min, int max, double avg, double std)
    //      print: "Numbers: "
    //      for (int i: numList)
    //          print: i + ", "
    //      print: "\nThe average is " + String.format("%.2f",avg)
    //      print: "\nThe minimum is " + min"
    //      print: "\nThe maximum is " + max"
    //      print: "\nThe standard deviation is " + String.format("%.2f",std)


    public static void main(String[] args) {
        //  Receive input and store it as an ArrayList
        //  int max, min;
        //  double avg, std;
        //  ArrayList<int> numList;
        //  numList = inputList(numList);
        //  Calculate Average, maximum, and minimum
        //  then use average to calculate standard deviation
        //  avg = average(numList);
        //  max = max(numList);
        //  min = min(numList);
        //  std = std(numList, avg);
        //  printValues(numList, min, max, avg, std);
    }
}
