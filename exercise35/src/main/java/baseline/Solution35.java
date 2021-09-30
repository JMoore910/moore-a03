package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that takes 6 names as input,
    stores them in an ArrayList, and chooses from the
    list of names using a random number generator
    The program must use a loop for taking user input
    The Program must use a random number generator
    Blank name entries are ignored, shortening the array
    Use an arrayList to store the names
    Create methods:
    -   inputList(ArrayList<String> nameList)
            > Uses a loop to take in user input
            > if user enters blank, skip that entry
    -   int generateRandom()
            > Use java.util.Random;
            > return random number upper limit: 6
    -   String pickWinner(ArrayList<String> nameList)
            > Use random number from generateRandom
            to output a name picked from the list as a winner
 */

public class Solution35 {
    //  Create method: public static ArrayList<String> inputList(ArrayList<String> nameList)
    //      String name;
    //      for (int i = 0; i < 6; i ++)
    //          prompt for user to input a name
    //          print: Enter a name:
    //          name = input.nextLine();
    //          if (!name.equals(""))
    //              name is not blank, add it
    //              list.add(name);
    //      return list;


    //  Create method: public static int generateRandom()
    //      Use java.util.Random;
    //      Random rand = new Random()
    //      return rand(6)


    //  Create method: public static void pickWinner(ArrayList<String> nameList, int randNum)
    //      if the array list is empty,
    //          winner = Nobody because you failed to enter any names
    //      else
    //          String winner = nameList.get(randNum)
    //      print: "The winner is... " + winner + "!!!"


    public static void main(String[] args) {
        //  ArrayList<String> nameList = new ArrayList<String>();
        //  pass the array list into inputList to get input and fill it with names
        //  nameList = inputList(nameList)
        //  int randNum = generateRandom();
        //  use random number to pick a name randomly from the list
        //  pickWinner(nameList, randNum);
    }
}
