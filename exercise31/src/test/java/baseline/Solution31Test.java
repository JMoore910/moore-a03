package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {
    Heartrate hrTest = new Heartrate();

    @Test
    void test_input_validation1(){
        boolean actualBool;
        actualBool = hrTest.validateInput("30","ABC");
        assertFalse(actualBool);
    }

    @Test
    void test_input_validation2() {
        boolean actualBool;
        actualBool = hrTest.validateInput("67", "27");
        assertTrue(actualBool);
    }

    @Test
    void test_target_calculation(){
        double actualTarget;
        actualTarget = hrTest.calculateTarget(65, .55, 22);
        assertEquals(138,actualTarget,0.5);
    }
}