package baseline;

/*
 *  COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

public class Employee {

    private final String firstName;
    private final String lastName;
    private final String occupation;
    private final String termination;


    //  Using overloaded constructors allows for setters to be ignored
    //  constructor if termination is included
    public Employee(String firstName, String lastName, String occupation, String termination) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.termination = termination;
    }

    //  constructor if termination is excluded
    public Employee(String firstName, String lastName, String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.termination = " ";
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getOccupation(){
        return occupation;
    }

    public String getTermination(){
        return termination;
    }



}