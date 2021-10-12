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
            > return random number upper limit: 6
    -   String pickWinner(ArrayList<String> nameList)
            > Use random number from generateRandom
            to output a name picked from the list as a winner
 */


public class Solution35 {
    public static void main(String[] args) {
        PrizeGame game = new PrizeGame();
        game.prizeGame();
    }
}
