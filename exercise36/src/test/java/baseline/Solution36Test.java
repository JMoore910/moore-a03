package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    Solution36 sol36 = new Solution36();
    public static ArrayList<Integer> list = new ArrayList<Integer>();


    @Test
    public void test_min_method(){
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(500);
        list.add(400);
        assertEquals(100, sol36.min(list));
    }

    @Test
    public void test_max_method(){
        assertEquals(500, sol36.max(list));
    }

    @Test
    public void test_avg_method(){
        assertEquals(300, sol36.average(list));
    }

    @Test
    public void test_std_method(){
        double avg = sol36.average(list);
        assertEquals(141.42, sol36.std(list,avg), 0.01);
    }
}