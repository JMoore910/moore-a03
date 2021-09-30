import baseline.Solution24;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    public void test_string_comparison() {
        Solution24 sol24 = new Solution24();
        String expected_string = "true";
        String actual_string = "true";
        assertEquals(expected_string.length(),actual_string.length());
        assertTrue(sol24.stringCompare(actual_string,expected_string));
    }
}