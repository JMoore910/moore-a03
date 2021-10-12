package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {
    GuessingGame testGame = new GuessingGame();

    @Test
    void test_guess_checker1() {
        boolean actualCheck;
        actualCheck = testGame.guessChecker("12", 12);
        assertTrue(actualCheck);
    }

    @Test
    void test_guess_checker2() {
        boolean actualCheck;
        actualCheck = testGame.guessChecker("150", 200);
        assertFalse(actualCheck);
    }

    @Test
    void test_difficulty_validation1() {
        boolean actualCheck = testGame.difficultyValidation("3");
        assertTrue(actualCheck);
    }

    @Test
    void test_difficulty_validation2() {
        boolean actualCheck = testGame.difficultyValidation("a");
        assertFalse(actualCheck);
    }
}
