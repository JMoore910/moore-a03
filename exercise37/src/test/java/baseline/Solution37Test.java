package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution37Test {
    PasswordGenerator test = new PasswordGenerator();

    @Test
    void test_input_validation_true() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("12", "3", "3"));
        assertTrue(test.validateUserInput(array));
    }

    @Test
    void test_input_validation_false() {
        ArrayList<String> array = new ArrayList<>(Arrays.asList("1","12","Susan"));
        assertFalse(test.validateUserInput(array));
    }
}