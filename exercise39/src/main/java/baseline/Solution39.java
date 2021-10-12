package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that takes a list of maps, and stores employee info at each index
    the list of maps is then sorted by the last names of the employees, and printed out to
    the user in the form of a table
    to do this, use Collections() sorting with a Comparator
    data must be stored in a list of maps
    Create Class: Employee
    Create Object: Comparator<HashMap<String, Employee>> compareMaps = new Comparator<>()
    Create Method: ArrayList<HashMap<String, Employee>> buildList()
    Create Method: ArrayList<HashMap<String, Employee>> sortList(ArrayList<HashMap<String, Employee>> list)
    Create Method: void printList(ArrayList<HashMap<String, Employee>> list)
 */

public class Solution39 {
    public static void main(String[] args) {
        EmployeeLister lister = new EmployeeLister();
        lister.runEmployeeLister();
    }
}
