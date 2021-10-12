package baseline;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeLister {
    private static final String KEY = "employee";
    //      comparator is an object that can be used with Collections to sort a list, providing instructions to .sort()
    private static final Comparator<HashMap<String, Employee>> compareMaps = Comparator.comparing(emp -> emp.get(KEY).getLastName());

    public List<HashMap<String, Employee>> buildList() {
        List<HashMap<String, Employee>> list = new ArrayList<>();
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

        //      All in all there are six employees to add to the list
        return list;
    }


    public void sortList(List<HashMap<String, Employee>> list) {
        list.sort(compareMaps);
    }


    public void printList(List<HashMap<String, Employee>> list) {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|-----------------");
        for (HashMap<String, Employee> employeeHashMap : list) {
            int stringLength = employeeHashMap.get(KEY).getFirstName().length() + employeeHashMap.get(KEY).getLastName().length() + 1;
            int numSpaces = 20 - stringLength;
            System.out.print(employeeHashMap.get(KEY).getFirstName() + " " + employeeHashMap.get(KEY).getLastName());
            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");
            stringLength = employeeHashMap.get(KEY).getOccupation().length();
            numSpaces = 18 - stringLength;
            System.out.print("| " + employeeHashMap.get(KEY).getOccupation());
            for (int j = 0; j < numSpaces; j++)
                System.out.print(" ");
            System.out.println("| " + employeeHashMap.get(KEY).getTermination());
        }
    }


    public void runEmployeeLister() {
        List<HashMap<String, Employee>> employeeList = buildList();
        sortList(employeeList);
        printList(employeeList);
    }
}
