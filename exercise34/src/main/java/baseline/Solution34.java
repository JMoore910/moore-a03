package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that has a list of five employee names and allows the user
    to input an employee name to remove. The application then searches the list for the
    specified name, and removes it.
    Create Method: public static LinkedList<String> createLinkedList()
    Create Method: public static LinkedList<String> removeNode(LinkedList<String> nameList, String name)
    Create Method: public static void printNameList(LinkedList<String> nameList)
 */


public class Solution34 {


    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.removeEmployee();
    }
}
