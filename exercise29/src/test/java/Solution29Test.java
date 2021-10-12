import baseline.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {
    Calculator testCalc = new Calculator();

    @Test
    void test_valid_input1(){
        boolean actualValid;
        actualValid = testCalc.validateInput("ABC");
        assertFalse(actualValid);
    }

    @Test
    void test_valid_input2(){
        boolean actualValid;
        actualValid = testCalc.validateInput("0");
        assertFalse(actualValid);
    }


    @Test
    void test_calculate_return(){
        int expectedTime;
        int actualTime;
        expectedTime = 36;
        actualTime = testCalc.calculateReturn(2);
        assertEquals(expectedTime,actualTime);
    }

    @Test
    void test_calculate_return2(){
        int expectedTime;
        int actualTime;
        expectedTime = 15;
        actualTime = testCalc.calculateReturn(5);
        assertEquals(expectedTime,actualTime);
    }
}