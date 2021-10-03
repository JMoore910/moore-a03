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

public class Solution40 {
    //  private static final String key = "employee";

    //  Create method: public static ArrayList<HashMap<String, Employee>> buildList()
    //      ArrayList<HashMap<String, Employee>> list = new ArrayList<>()
    //      HashMap<String, Employee> employee = new HashMap<>();
    //      build full list of employees
    //      employee.put(key, new Employee("Insert employee info strings"))
    //      list.add(employee)
    //      employee = new HashMap<>()
    //      ....
    //      repeat for all 6 employees
    //
    //      return list


    //  Create method: public static String getUserInput()
    //      Scanner input = new Scanner(System.in)
    //      String userInput = input.nextLine()
    //      return userInput

    //  Create method: public static ArrayList<HashMap<String, Employee>> searchList(String search, ArrayList<HashMap<String, Employee>> list)
    //      method accepts user's search string and the list in which to search
    //      creates a return variable: a new list that will have all employees found in search
    //      ArrayList<HashMap<String, Employee>> searchList = new ArrayList<>();
    //      iterate through list to find employees that match the search profile
    //      for (int i = 0; i < list.size(); i++)
    //          if list.get(i).get(key).getFirstName().contains(search) or list.get(i).get(key).getLastName().contains(search)
    //              searchList.add(list.get(i).get(key))
    //      return searchList


    //  Create method: public static void printList(ArrayList<HashMap<String, Employee>> list)
    //      method prints out searched list. If the list is empty,
    //          no matches were found
    //      else
    //          print: Table format
    //          for (int i = 0; i < list.size(); i++)
    //              calculate number of spaces to insert after name has been printed
    //              int stringLength = list.get(i).get(key).getFirstName().length() + list.get(i).get(key).getLastName().length() + 1
    //              int numSpaces = 20 - stringLength
    //              print: employee first name and last name at list.get(i).get(key)
    //              for (int j = 0; j < numSpaces; j++)
    //                  print: " "
    //              stringLength = list.get(i).get(key).getOccupation().length()
    //              numSpaces = 18 - stringLength;
    //              print: employee occupation at list.get(i).get(key)
    //              loop to print spaces for numSpaces again
    //              print: employee termination at list.get(i).get(key)
    //              termination will be set to " " if constructor does not receive it as an argument

    public static void main(String[] args) {
        //  ArrayList<HashMap<String, Employee>> list = buildList();
        //  String search = getUserInput();
        //  ArrayList<HashMap<String, Employee>> foundList = searchList(search, list)
        //  printList(foundList)
    }
}