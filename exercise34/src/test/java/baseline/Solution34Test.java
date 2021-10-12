package baseline;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    Employee empTest = new Employee();

    @Test
    void test_create_linked_list(){
        int expectedSize, actualSize;
        List<String> list = new LinkedList<>();
        list = empTest.createLinkedList(list);
        expectedSize = 5;
        actualSize = list.size();
        assertEquals(expectedSize,actualSize);
    }

    @Test
    void test_remove_node(){
        int expectedSize, actualSize;
        List<String> list = new LinkedList<>();
        list = empTest.createLinkedList(list);
        list = empTest.removeNode(list,"Amanda Cullen");
        expectedSize = 4;
        actualSize = list.size();
        assertEquals(expectedSize,actualSize);
    }
}