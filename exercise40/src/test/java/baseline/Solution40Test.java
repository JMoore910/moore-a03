package baseline;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Solution40Test {
    Solution40 sol40 = new Solution40();


    @Test
    public void test_list_search(){
        ArrayList<HashMap<String, Employee>> actual = new ArrayList<>();
        ArrayList<HashMap<String, Employee>> expected = new ArrayList<>();
        HashMap<String, Employee> employeeTest = new HashMap<>();
        employeeTest.put("employee", new Employee("abc","fgh","testbot"));
        expected.add(employeeTest);
        actual.add(employeeTest);
        employeeTest = new HashMap<>();
        employeeTest.put("employee", new Employee("xxx","zzz","testbot"));
        actual.add(employeeTest);
        assertEquals(expected,sol40.searchList("abc",actual));
    }

}