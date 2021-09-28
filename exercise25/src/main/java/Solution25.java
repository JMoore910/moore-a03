/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that prompts for and receives a string of characters
    and checks how strong that string would be as a password
    very weak: String contains only numbers                              fewer than 8 characters
    weak: String contains only letters                                   fewer than 8 characters
    strong: String contains letters and at least one number                at least 8 characters
    very strong: String contains letters, numbers, and special characters  at least 8 characters
 */

public class Solution25 {
    //public String passwordValidator(String A){
    //if string is less than 8 characters
    //      strength is either very weak, weak, or unknown(less than 8 but mix of chars)
    //      if A.matches("[0-9]+"){
    //          password is purely numeric, return 1 (very weak)
    //      else if A.matches("[a-zA-Z]+")
    //          password is purely letters , return 2 (weak)
    //      else
    //          neither case is met, return 0 (unknown)
    //else if string is more than 8 characters
    //      strength is either strong, very strong, or unknown
    //      int numCount=0, alphaCount=0, specCount=0;
    //      use .isDigit and .isAlphabetic to find the count of letters, numbers, and special characters
    //      using if-else statements
    //      for (int i = 0; i < A.length(); i++){
    //          if (Character.isDigit(A.charAt(i)){
    //              numCount++;
    //          else if (Character.isAlphabetic(A.charAt(i)){
    //              alphaCount++;
    //          else
    //              specCount++;
    //
    //      if (alphaCount > 0 && numCount > 0 && specCount == 0)
    //          password contains at least one number, no special chars, return 3 (strong)
    //      else if (alphaCount > 0 && numcount > o && specCount > 0)
    //          password contains at least one of each type of char, return 4 (very strong)
    //      else
    //          password contains only one type of char, return 0 (unknown)


    public static void main(String[] args) {
        //int strength
        //String output
        //prompt for a string to be input and receive input
        //pass the string into password validator and assign returned statement to an int strength
        //use a switch function to assign a string a rating based on int strength [0-4]
        //Switch strength
        //case 1:
        //  output is very weak
        //  break
        //case 2:
        //  output is weak
        //  break
        //case 3:
        //  output is strong
        //  break
        //case 4:
        //  output is very strong
        //  break
        //default case:
        //  output is "unknown"
        //  break

        //with output concatenate strength to the end of output to describe password in a single output statement
    }
}
