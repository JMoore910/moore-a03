import baseline.Solution29;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    Solution29 sol29 = new Solution29();

    @Test
    public void test_valid_input(){
        boolean expectedValid, actualValid;
        expectedValid = false;
        actualValid = sol29.validateInput("ABC");
        assertEquals(expectedValid,actualValid);
        actualValid = sol29.validateInput("0");
        assertEquals(expectedValid,actualValid);
        expectedValid = true;
        actualValid = sol29.validateInput("12");
        assertEquals(expectedValid,actualValid);
    }

    @Test
    public void test_calculate_return(){
        int expectedTime, actualTime;
        expectedTime = 36;
        actualTime = sol29.calculateReturn(2);
        assertEquals(expectedTime,actualTime);
        expectedTime = 15;
        actualTime = sol29.calculateReturn(5);
        assertEquals(expectedTime,actualTime);
    }
}