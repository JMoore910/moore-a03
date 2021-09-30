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

import java.util.Scanner;
import java.util.Random;
import static java.lang.Math.pow;
import static java.lang.Integer.parseInt;

public class Solution32 {
    //Make scanner public static final so all methods may make use of it
    public static final Scanner input = new Scanner(System.in);

    public static boolean guessChecker(String guess, int randNum) {
        boolean check;
        if (!guess.matches("[0-9]+")) {
            System.out.printf("Not a number: ");
            check = false;
        } else if (parseInt(guess) > randNum) {
            System.out.printf("Too high. ");
            check = false;
        } else if (parseInt(guess) < randNum) {
            System.out.printf("Too low. ");
            check = false;
        } else
            check = true;
        return check;
    }

    public static boolean difficultyValidation(String diff) {
        if (!diff.matches("[1-3]"))
            return false;
        else
            return true;
    }


    public static int inputDifficulty() {
        boolean valid = false;
        String difficulty = "";
        int randNum;
        System.out.println("lets play Guess the Number!\n");
        //      prompt for user to input difficulty
        System.out.printf("Enter the difficulty level (1, 2, or 3): ");
        //      get input from user
        difficulty = input.nextLine();
        while (!valid) {
            valid = difficultyValidation(difficulty);
            if (!valid) {
                //              prompt for user to input difficulty
                System.out.printf("Please enter a number (1, 2, or 3): ");
                difficulty = input.nextLine();
            }
        }
        //      exit loop: difficulty is set
        return parseInt(difficulty);
    }

    public static int generateRandom(int diff) {
        //      change difficulty to represent the range it can cover
        Random rand = new Random();
        double upper = pow(10, diff);
        //      use range to generate a random number for program
        int randNum = rand.nextInt((int)upper);
        return randNum;
    }

    public static void guessingGame(int randNum) {
        //      Now program has a random number, the guessing game can start
        boolean guessed;
        int guessCount = 0;
        String guess;
        //      prompt for user to guess a number
        System.out.printf("I have my number. What is your guess? ");
        guess = input.nextLine();
        guessed = false;
        while (!guessed) {
            guessCount++;
            guessed = guessChecker(guess, randNum);
            if (!guessed) {
                System.out.printf("Guess again: ");
                guess = input.nextLine();
            }
        }
        //      exit loop
        System.out.println("You got it in " + guessCount + " guesses! \n");
    }

    public static boolean continuePlaying() {
        //      prompt user to say whether to play again or not
        System.out.printf("Do you want to play again (Y/N)? ");
        String cont;
        cont = input.nextLine();
        //      Loop until a valid input is given
        while (true) {
            if (cont.matches("[nN]+"))
                return true;
            else if (cont.matches("[yY]+"))
                return false;
            else
                System.out.println("please enter a valid option: Continue the game (Y/N)? ");
        }
    }


    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            int diff = inputDifficulty();
            int randNum = generateRandom(diff);
            guessingGame(randNum);
            quit = continuePlaying();
            System.out.println("\n");
        }
    }
}
