package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    Solution31 sol31 = new Solution31();

    @Test
    public void test_input_validation(){
        boolean expectedBool,actualBool;
        expectedBool = false;
        actualBool = sol31.validateInput("30","ABC");
        assertEquals(expectedBool,actualBool);
        expectedBool = true;
        actualBool = sol31.validateInput("67", "27");
        assertEquals(expectedBool,actualBool);
    }

    @Test
    public void test_target_calculation(){
        double expectedTarget, actualTarget;
        expectedTarget = 138;
        actualTarget = sol31.calculateTarget(65, .55, 22);
        assertEquals(expectedTarget,actualTarget,0.5);
    }
}