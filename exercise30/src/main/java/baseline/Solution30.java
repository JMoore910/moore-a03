package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that generates a multiplication table for the numbers 1 through 12 (inclusive)
    Create a method that uses a nested loop to multiply and output the table.
 */

public class Solution30 {

    //  Create Method: public void multiplyTable()
    public static void multiplyTable(){
        int i, j;
        for (i = 1 ;i <= 12; i++) {
            for (j = 1 ;j <= 12; j++) {
                if (i*j < 10)
                    System.out.printf("    " + i*j);
                else if (i*j < 100)
                    System.out.printf("   " + i*j);
                else
                    System.out.printf("  " + i*j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        multiplyTable();
        //No input is needed in any form.
        //multiplyTable() is called and is a simple output function
        //No JUnit tests are required as the only function used is an output function
    }
}
