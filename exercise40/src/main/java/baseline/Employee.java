package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */


public class Employee {

    private String firstName;
    private String lastName;
    private String occupation;
    private String termination;

    //  Constructor for if employee has been terminated
    public Employee(String firstName,String lastName,String occupation,String termination) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.termination = termination;
    }

    //  Constructor for if employee has not been terminated
    public Employee(String firstName,String lastName,String occupation) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.occupation = occupation;
        this.termination = " ";
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getTermination() {
        return termination;
    }
}


