package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    Solution37 sol37 = new Solution37();

    @Test
    void test_input_validation_true() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("12", "3", "3"));
        assertTrue(sol37.validateUserInput(array));
    }

    @Test
    void test_input_validation_false() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("1","12","Susan"));
        assertFalse(sol37.validateUserInput(array));
    }
}