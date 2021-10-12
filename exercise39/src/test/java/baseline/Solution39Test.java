package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {
    public static final String KEY = "employee";
    EmployeeLister test = new EmployeeLister();

    @Test
    void test_employee_list_sort() {
        List<HashMap<String, Employee>> list = new ArrayList<>();
        HashMap<String, Employee> employee = new HashMap<>();
        //  Declare and set a map for each employee on record, then add them to the list one by one
        employee.put(KEY, new Employee("John", "E", "Manager", "2016-12-31"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Tou", "B", "Software Engineer", "2016-10-05"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Michaela", "D", "District Manager", "2015-12-19"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Jake", "A", "Programmer"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Jacquelyn", "C", "DBA"));
        list.add(employee);
        employee = new HashMap<>();
        employee.put(KEY, new Employee("Sally", "F", "Web Developer", "2015-12-18"));
        list.add(employee);

        test.sortList(list);
        assertEquals("John",list.get(4).get(KEY).getFirstName());
    }


}