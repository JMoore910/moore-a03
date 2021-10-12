package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    Calculator test = new Calculator();
    public static ArrayList<Integer> list = new ArrayList<>();


    @Test
    void test_min_method(){
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(500);
        list.add(400);
        assertEquals(100, test.min(list));
    }

    @Test
    void test_max_method(){
        assertEquals(500, test.max(list));
    }

    @Test
    void test_avg_method(){
        assertEquals(300, test.average(list));
    }

    @Test
    void test_std_method(){
        double avg = test.average(list);
        assertEquals(141.42, test.std(list,avg), 0.01);
    }
}