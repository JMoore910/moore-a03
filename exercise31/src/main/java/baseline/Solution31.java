package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that creates a heartrate table
    that uses a given formula to find your heartrate at
    a specific exertion intensity based on Resting Pulse
    and age, which are given as input from the user
 */


public class Solution31 {
    public static void main(String[] args) {
        Heartrate hr = new Heartrate();
        hr.run();
    }
}
