import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {
    Solution28 sol28 = new Solution28();

    @Test
    public void test_sum_calculation(){
        int expectedSum, actualSum;
        expectedSum = 15;
        actualSum = sol28.calculateSum(10,5);

        assertEquals(expectedSum,actualSum);
    }

}