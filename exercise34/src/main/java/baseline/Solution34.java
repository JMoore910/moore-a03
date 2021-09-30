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

import java.util.LinkedList;
import java.util.Scanner;

public class Solution34 {
    public static LinkedList<String> createLinkedList(LinkedList<String> nameList) {
        nameList.add("John Smith");
        nameList.add("Jackie Jackson");
        nameList.add("Chris Jones");
        nameList.add("Amanda Cullen");
        nameList.add("Jeremy Goodwin");
        return nameList;
    }

    public static LinkedList<String> removeNode(LinkedList<String> nameList, String name) {
        nameList.remove(name);
        return nameList;
    }

    public static void printNameList(LinkedList<String> nameList) {
        System.out.printf("\nThere are " + nameList.size() + " employees.\n");
        for (String name : nameList)
            System.out.println(name);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<String> nameList = new LinkedList<String>();
        nameList = createLinkedList(nameList);
        printNameList(nameList);
        //  prompt user to enter an employee name to remove
        System.out.printf("Enter an employee name to remove: ");
        //  receive name as input from user
        String name = input.nextLine();
        removeNode(nameList, name);
        printNameList(nameList);
    }
}
