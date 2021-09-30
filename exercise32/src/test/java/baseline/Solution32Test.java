package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    Solution32 sol32 = new Solution32();

    @Test
    public void test_guess_checker(){
        boolean actualCheck;
        actualCheck = sol32.guessChecker("12",12);
        assertEquals(true, actualCheck);
        actualCheck = sol32.guessChecker("150", 200);
        assertEquals(false, actualCheck);
    }

    @Test
    public void test_difficulty_validation(){
        boolean actualCheck = sol32.difficultyValidation("3");
        assertEquals(true, actualCheck);
        actualCheck = sol32.difficultyValidation("a");
        assertEquals(false, actualCheck);
    }
}