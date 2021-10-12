package baseline;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EmployeeLister {
    private static final String KEY = "employee";

    public List<HashMap<String, Employee>> buildList() {
        ArrayList<HashMap<String, Employee>> list = new ArrayList<>();
        HashMap<String, Employee> employee = new HashMap<>();
        //  Declare and set a map for each employee on record, then add them to the list one by one
        employee.put(KEY, new Employee("John","Johnson","Manager","2016-12-31"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Tou","Xiong","Software Engineer","2016-10-05"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Michaela","Michaelson","District Manager","2015-12-19"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Jake","Jacobson","Programmer"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Jacquelyn","Jackson","DBA"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Sally","Webber","Web Developer","2015-12-18"));
        list.add(employee);
        return list;
    }

    public String getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a search string: ");
        String userInput = input.nextLine();
        System.out.println("\nResults:\n");
        return userInput;
    }

    public List<HashMap<String, Employee>> searchList(String search, List<HashMap<String, Employee>> list) {
        //      method accepts user's search string and the list in which to search
        //      creates a return variable: a new list that will have all employees found in search
        List<HashMap<String, Employee>> searchList = new ArrayList<>();
        //      iterate through list to find employees that match the search profile
        for (HashMap<String, Employee> stringEmployeeHashMap : list) {
            if (stringEmployeeHashMap.get(KEY).getFirstName().contains(search) || stringEmployeeHashMap.get(KEY).getLastName().contains(search))
                searchList.add(stringEmployeeHashMap);
        }
        return searchList;
    }

    public void printList(List<HashMap<String, Employee>> list) {
        //      method prints out searched list. If the list is empty,
        if (list.isEmpty()) {
            System.out.println("No matches were found.");
        } else {
            //  print: Table format
            System.out.println("Name                | Position          | Separation Date");
            System.out.println("--------------------|-------------------|-----------------");
            for (HashMap<String, Employee> stringEmployeeHashMap : list) {
                //    calculate number of spaces to insert after name has been printed
                int stringLength = stringEmployeeHashMap.get(KEY).getFirstName().length() + stringEmployeeHashMap.get(KEY).getLastName().length() + 1;
                int numSpaces = 20 - stringLength;
                System.out.print(stringEmployeeHashMap.get(KEY).getFirstName() + " " + stringEmployeeHashMap.get(KEY).getLastName());
                for (int j = 0; j < numSpaces; j++)
                    System.out.print(" ");
                stringLength = stringEmployeeHashMap.get(KEY).getOccupation().length();
                numSpaces = 18 - stringLength;
                System.out.print("| " + stringEmployeeHashMap.get(KEY).getOccupation());
                for (int j = 0; j < numSpaces; j++)
                    System.out.print(" ");
                System.out.println("| " + stringEmployeeHashMap.get(KEY).getTermination());
            }
        }
    }

    public void runEmployeeLister() {
        List<HashMap<String, Employee>> list = buildList();
        String search = getUserInput();
        List<HashMap<String, Employee>> foundList = searchList(search, list);
        printList(foundList);
    }
}
