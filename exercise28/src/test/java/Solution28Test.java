import baseline.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    Calculator testSum = new Calculator();

    @Test
    void test_sum_calculation(){
        int expectedSum, actualSum;
        expectedSum = 15;
        actualSum = testSum.calculateSum(10,5);

        assertEquals(expectedSum,actualSum);
    }

}