import baseline.Solution25;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    public void test_password_validation() {
        Solution25 sol25 = new Solution25();
        int expected_strength;
        int actual_strength;
        String password = "123456"; //1
        assertEquals(1,sol25.passwordValidator(password));
        password = "abcdef"; //2
        assertEquals(2,sol25.passwordValidator(password));
        password = "abcd1234"; //3
        assertEquals(3,sol25.passwordValidator(password));
        password = "abc123!@#"; //4
        assertEquals(4,sol25.passwordValidator(password));
        password = "********"; //0
        assertEquals(0,sol25.passwordValidator(password));
        password = "abcdefgh"; //0
        assertEquals(0,sol25.passwordValidator(password));
        password = "12345678"; //0
        assertEquals(0,sol25.passwordValidator(password));
        password = "***"; //0
        assertEquals(0,sol25.passwordValidator(password));
    }
}