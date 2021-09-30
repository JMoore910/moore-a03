package baseline;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {
    Solution34 sol34 = new Solution34();

    @Test
    public void test_create_linked_list(){
        int expectedSize, actualSize;
        LinkedList<String> list = new LinkedList<String>();
        list = sol34.createLinkedList(list);
        expectedSize = 5;
        actualSize = list.size();
        assertEquals(expectedSize,actualSize);
    }

    @Test
    public void test_remove_node(){
        int expectedSize, actualSize;
        LinkedList<String> list = new LinkedList<String>();
        list = sol34.createLinkedList(list);
        list = sol34.removeNode(list,"Amanda Cullen");
        expectedSize = 4;
        actualSize = list.size();
        assertEquals(expectedSize,actualSize);
    }
}