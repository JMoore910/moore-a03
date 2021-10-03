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

import java.util.*;

public class Solution39 {
    public static final String key = "employee";


    private static Comparator<HashMap<String, Employee>> compareMaps = new Comparator<>() {
        //      comparator is an object that can be used with Collections to sort a list, providing instructions to .sort()
        public int compare(HashMap<String, Employee> emp1, HashMap<String, Employee> emp2) {
            return emp1.get(key).getLastName().compareTo(emp2.get(key).getLastName());
        }
    };

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

        //      All in all there are six employees to add to the list
        return list;
    }


    public static ArrayList<HashMap<String, Employee>> sortList(ArrayList<HashMap<String, Employee>> list) {
        Collections.sort(list, compareMaps);
        return list;
    }


    public static void printList(ArrayList<HashMap<String, Employee>> list) {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|-----------------");
        for (int i = 0; i < list.size(); i ++) {
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

    public static void main(String[] args) {
        ArrayList<HashMap<String, Employee>> employeeList = buildList();
        sortList(employeeList);
        printList(employeeList);
    }
}
