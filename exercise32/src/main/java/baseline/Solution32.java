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
    //Make scanner public static final so all methods may make use of it


    //  Create method: public static boolean guessChecker(String guess, int randNum)
    //      if (!guess.matches("[1-3]"))
    //          print: "Not a number: "
    //          return false;
    //      else if (parseInt(guess) > randNum)
    //          print: "Too high: "
    //          return false;
    //      else if (parseInt(guess) < randNum)
    //          print: "Too low: "
    //          return false;
    //      else
    //          return true;


    //  Create method: public static boolean difficultyValidation(String diff)
    //      if (!guess.matches("[1-3]"))
    //          return false
    //      else
    //          return true


    //  Create method: public static int InputDifficulty()
    //      boolean valid = false;
    //      String difficulty = "";
    //      int randNum;
    //      printline: "lets play Guess the Number!\n"
    //      prompt for user to input difficulty
    //      print: "Enter the difficulty level (1, 2, or 3): "
    //      get input from user
    //      difficulty = input.nextLine();
    //      EnterWhileLoop: while (!valid)
    //          valid = difficultyValidation(difficulty)
    //          if (!valid)
    //              prompt for user to input difficulty
    //              print: Please enter a number (1, 2, or 3)
    //              prompt for user to input difficulty
    //              difficulty = input.nextLine();
    //      exit loop: difficulty is set
    //      return parseInt(difficulty)


    //  Create method: public static int generateRandom(int diff)
    //      change difficulty to represent the range it can cover
    //      int randNum = pow(10,diff);
    //      use range to generate a random number for program
    //      randNum = randomNumber %0-randNum;
    //      return randNum;


    //  Create method: public static void guessingGame(int randNum)
    //      Now program has a random number, the guessing game can start
    //      boolean guessed;
    //      int guessCount = 0;
    //      String guess = "";
    //      prompt for user to guess a number
    //      print: "I have my number. What's your guess? "
    //      guess = input.nextLine();
    //      guessed = false;
    //      EnterWhileLoop: while (!guessed)
    //          guessCount ++;
    //          guessed = guessChecker(guess,randNum)
    //          if (!guessed)
    //              print: "Guess again: "
    //              guess = input.nextLine();
    //      exit loop
    //      printline: "You got it in guessCount guesses! \n"


    //  Create method: public static boolean continuePlaying()
    //      prompt user to say whether to play again or not
    //      print: "Do you want to play again (Y/N)? "
    //      String continue;
    //      continue = input.nextLine();
    //      EnterLoop: Loop until a valid input is given
    //      EnterWhileLoop: while (1)
    //          if (continue.matches("[n]+"))
    //              return true;
    //          else if (continue.matches("[y]+"))
    //              return false;
    //          else
    //              print: please enter a valid option: Continue the game (Y/N)?

    public static void main(String[] args) {
        //  boolean quit = false;
        //  BeginWhileLoop: while (!quit) {
        //      int diff = inputDifficulty();
        //      int randNum = generateRandomNumber(diff);
        //      guessingGame(randNum);
        //      quit = continuePlaying();
    }
}
