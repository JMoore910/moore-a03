package baseline;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class GuessingGame {//Make scanner public static final so all methods may make use of it
    public static final Scanner input = new Scanner(System.in);
    public static final Random rand = new Random();

    public boolean guessChecker(String guess, int randNum) {
        boolean check;
        if (!guess.matches("[0-9]+")) {
            System.out.print("Not a number: ");
            check = false;
        } else if (parseInt(guess) > randNum) {
            System.out.print("Too high. ");
            check = false;
        } else if (parseInt(guess) < randNum) {
            System.out.print("Too low. ");
            check = false;
        } else
            check = true;
        return check;
    }

    public boolean difficultyValidation(String diff) {
        return diff.matches("[1-3]");
    }


    public int inputDifficulty() {
        boolean valid = false;
        String difficulty;
        System.out.println("lets play Guess the Number!\n");
        //      prompt for user to input difficulty
        System.out.print("Enter the difficulty level (1, 2, or 3): ");
        //      get input from user
        difficulty = input.nextLine();
        while (!valid) {
            valid = difficultyValidation(difficulty);
            if (!valid) {
                //              prompt for user to input difficulty
                System.out.print("Please enter a number (1, 2, or 3): ");
                difficulty = input.nextLine();
            }
        }
        //      exit loop: difficulty is set
        return parseInt(difficulty);
    }

    public int generateRandom(int diff) {
        //      change difficulty to represent the range it can cover

        double upper = pow(10, diff);
        //      use range to generate a random number for program
        return rand.nextInt((int)upper);
    }

    public void guessingGame(int randNum) {
        //      Now program has a random number, the guessing game can start
        boolean guessed;
        int guessCount = 0;
        String guess;
        //      prompt for user to guess a number
        System.out.print("I have my number. What is your guess? ");
        guess = input.nextLine();
        guessed = false;
        while (!guessed) {
            guessCount++;
            guessed = guessChecker(guess, randNum);
            if (!guessed) {
                System.out.print("Guess again: ");
                guess = input.nextLine();
            }
        }
        //      exit loop
        System.out.println("You got it in " + guessCount + " guesses! \n");
    }

    public boolean continuePlaying() {
        //      prompt user to say whether to play again or not
        System.out.print("Do you want to play again (Y/N)? ");
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

    public void gameLoop() {
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
