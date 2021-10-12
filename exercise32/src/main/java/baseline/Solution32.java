package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that plays a number guessing game with the user
    The user gets to input a difficulty level (1 ,2 ,3)
    difficulty level 1: random numbers between 1 and 10
    difficulty level 2: random numbers between 1 and 100
    difficulty level 3: random numbers between 1 and 1000
    The user makes guesses as to what the random number is
    if the guess isn't a number,
        print: "Not a number. "
    if the guess is greater than the target,
        print: "Too high. "
    else if the guess is lower than the target,
        print: "Too low. "
    else
        print: "You got it in x guesses!"
    guesses should be counted up, and printed when the correct guess is made
    Make the whole game run in a while loop that runs as long as continue is true
    Create method: public static boolean guessChecker(String guess, String randNum)
    Create method: public static boolean difficultyValidation(String diff)
 */


public class Solution32 {
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        game.gameLoop();
    }
}
