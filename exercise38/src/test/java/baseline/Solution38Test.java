package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    Solution38 sol38 = new Solution38();
    public static ArrayList<String> expectedEvens = new ArrayList<>(Arrays.asList("2","4","6"));

    @Test
    public void test_input_validation_true(){
        assertTrue(sol38.inputValidation("1 2 3 4 5 6"));
    }

    @Test
    public void test_input_validation_false(){
        assertFalse(sol38.inputValidation("abc 123"));
    }

    @Test
    public void test_find_evens(){
        assertEquals(expectedEvens,sol38.findEvens("1 2 3 4 5 6"));
    }
}