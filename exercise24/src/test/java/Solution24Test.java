import baseline.Compare;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    void test_string_comparison() {
        Compare compTest = new Compare();
        String expected_string = "true";
        String actual_string = "teur";
        assertEquals(expected_string.length(),actual_string.length());
        assertTrue(compTest.stringCompare(actual_string,expected_string));
    }
}