package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create a magic 8-ball program that has stored responses in a list
    get input from user, then throw it away and choose a random response from the list
    Create method: magicEightBall(int randNum)
    receives a randomly generated number from 0-3, then looks at a list for a response, and outputs that response
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.List;

public class Solution33 {

    public static void magicEightBall(int randNum) {
        List<String> responseList = new ArrayList<String>();
        //      Add the responses to the list
        responseList.add("Yes");
        responseList.add("No");
        responseList.add("Maybe");
        responseList.add("Ask again later.");
        //      print out the response at randNum index
        System.out.printf(responseList.get(randNum));
        //Simple output statement method, no test required
    }

    public static void main(String[] args) {
        //  Prompt for user to input a temp string as a question to a magic 8-ball
        System.out.printf("What's your question? \n> ");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        //  generate a random integer and send it into the magicEightBall method
        Random rand = new Random();
        int randInt = rand.nextInt(4);
        magicEightBall(randInt);
    }
}
