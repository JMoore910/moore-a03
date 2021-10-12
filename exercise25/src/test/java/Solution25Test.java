import baseline.Password;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {

    public final Password pwTest = new Password();

    @Test
    void test_password_validation1() {
        String password = "123456"; //1
        assertEquals(1,pwTest.passwordValidator(password));
    }


    @Test
    void test_password_validation2() {
        String password = "abcdef"; //2
        assertEquals(2,pwTest.passwordValidator(password));
    }


    @Test
    void test_password_validation3() {
        String password = "abcd1234"; //3
        assertEquals(3, pwTest.passwordValidator(password));
    }

    @Test
    void test_password_validation4() {
        String password = "abc123!@#"; //4
        assertEquals(4, pwTest.passwordValidator(password));
    }

    @Test
    void test_password_validation0() {
        String password = "********"; //0
        assertEquals(0, pwTest.passwordValidator(password));
    }
}