package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {
    FindEvenNumbers test = new FindEvenNumbers();
    public static ArrayList<String> expectedEvens = new ArrayList<>(Arrays.asList("2","4","6"));

    @Test
    void test_input_validation_true(){
        assertTrue(test.inputValidation("1 2 3 4 5 6"));
    }

    @Test
    void test_input_validation_false(){
        assertFalse(test.inputValidation("abc 123"));
    }

    @Test
    void test_find_evens(){
        assertEquals(expectedEvens,test.findEvens("1 2 3 4 5 6"));
    }
}