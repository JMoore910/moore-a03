package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Sean Moore
 */

/*
    Create an application that stores a list of 6 maps containing info of 1 employee each
    Once list has been built, ask user to input a string.
    Then the application will build a new list of employees whose first or last name contains
    the string specified by the user.
    The resulting list is then printed
 */

import java.util.*;

public class Solution40 {
    private static final String key = "employee";

    public static ArrayList<HashMap<String, Employee>> buildList() {
        ArrayList<HashMap<String, Employee>> list = new ArrayList<>();
        HashMap<String, Employee> employee = new HashMap<>();
        //  Declare and set a map for each employee on record, then add them to the list one by one
        employee.put(key, new Employee("John","Johnson","Manager","2016-12-31"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(key, new Employee("Tou","Xiong","Software Engineer","2016-10-05"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(key, new Employee("Michaela","Michaelson","District Manager","2015-12-19"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(key, new Employee("Jake","Jacobson","Programmer"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(key, new Employee("Jacquelyn","Jackson","DBA"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(key, new Employee("Sally","Webber","Web Developer","2015-12-18"));
        list.add(employee);
        return list;
    }

    public static String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a search string: ");
        String userInput = input.nextLine();
        System.out.println("\nResults:\n");
        return userInput;
    }

    public static ArrayList<HashMap<String, Employee>> searchList(String search, ArrayList<HashMap<String, Employee>> list) {
        //      method accepts user's search string and the list in which to search
        //      creates a return variable: a new list that will have all employees found in search
        ArrayList<HashMap<String, Employee>> searchList = new ArrayList<>();
        //      iterate through list to find employees that match the search profile
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).get(key).getFirstName().contains(search) || list.get(i).get(key).getLastName().contains(search))
             searchList.add(list.get(i));
        }
        return searchList;
    }

    public static void printList(ArrayList<HashMap<String, Employee>> list) {
        //      method prints out searched list. If the list is empty,
        if (list.size() == 0) {
            System.out.println("No matches were found.");
        } else {
            //  print: Table format
            System.out.println("Name                | Position          | Separation Date");
            System.out.println("--------------------|-------------------|-----------------");
            for (int i = 0; i < list.size(); i ++) {
                //    calculate number of spaces to insert after name has been printed
                int stringLength = list.get(i).get(key).getFirstName().length() + list.get(i).get(key).getLastName().length() + 1;
                int numSpaces = 20 - stringLength;
                System.out.printf(list.get(i).get(key).getFirstName() + " " + list.get(i).get(key).getLastName());
                for (int j = 0; j < numSpaces; j++)
                    System.out.printf(" ");
                stringLength = list.get(i).get(key).getOccupation().length();
                numSpaces = 18 - stringLength;
                System.out.printf("| " + list.get(i).get(key).getOccupation());
                for (int j = 0; j < numSpaces; j++)
                    System.out.printf(" ");
                System.out.println("| " + list.get(i).get(key).getTermination());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<HashMap<String, Employee>> list = buildList();
        String search = getUserInput();
        ArrayList<HashMap<String, Employee>> foundList = searchList(search, list);
        printList(foundList);
    }
}