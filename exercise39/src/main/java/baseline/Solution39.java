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
    Create Method: ArrayList<HashMap<String, String>> buildList()
    Create Method: ArrayList<HashMap<String, String>> listSort(List<HashMap<String, Employee>> list)
    Create Method: void printList(List<HashMap<String, String>> list)
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution39 {
    //  public static final String key = "employee";


    //  Create method: public Comparator<HashMap<String, Employee>> compareMaps = new Comparator<>()
    //      comparator is an object that can be used with Collections to sort a list, providing instructions to .sort()
    //      public int compare(HashMap<String, Employee> emp1, HashMap<String, Employee> emp2)
    //          return emp1.get("employee").getLastName().compareTo(emp2.get(key).getLastName());


    //  Create method: public static ArrayList<Map<String, Employee>> buildList()
    //      public static List<HashMap<String, Employee>> list = new ArrayList<>();
    //      HashMap<String, Employee> employee = new HashMap<>();
    //      Declare and set a map for each employee on record, then add them to the list one by one
    //      employee.put(key, new Employee("insert strings for constructor"))
    //      list.add(employee)
    //      employee = new HashMap<>();
    //      employee.put(key, new Employee("insert strings for constructor"))
    //      list.add(employee)
    //      employee = new HashMap<>();
    //      employee.put(key, new Employee("insert strings for constructor"))
    //      .......
    //      list.add(employee)
    //
    //      All in all there are six employees to add to the list
    //      return list;


    //  Create method: public static ArrayList<HashMap<String, String>> listSort(List<HashMap<String, Employee>> list)
    //      return Collections.sort(list, compareMaps);


    //  Create method: public static void printList(ArrayList<HashMap<String, String>> list)
    //      print:"Name                | Position          | Separation Date
    //      print:"--------------------|-------------------|------------------------
    //      for (int i = 0; i < list.size(); i ++)
    //          int stringLength = list.get(i).get(key).getFirstName().length() + list.get(i).get(key).getLastName().length() + 1
    //          int numSpaces = 20 - stringLength
    //          print: list.get(i).get(key).getFirstName() + " " + list.get(i).get(key).getLastName()
    //          for (int j = 0; j < numSpaces; j++)
    //              print: " "
    //          stringLength = list.get(i).get(key).getOccupation().length()
    //          numSpaces = 18 - stringLength
    //          print: "| " + list.get(i).get(key).getOccupation()
    //          for (j = 0; j < numSpaces; j++)
    //              print: " "
    //          print "| " + list.get(i).get(key).getTermination()


    public static void main(String[] args) {
        //  ArrayList<HashMap<String, Employee>> employeeList = buildList();
        //  sortList(employeeList);
        //  printList(employeeList);
    }
}
