package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {
    MagicEightBall test = new MagicEightBall();


    @Test
    void test_magic_eight_ball1(){
        assertEquals("Yes",test.magicEightBall(0));
    }

    @Test
    void test_magic_eight_ball2(){
        assertEquals("No",test.magicEightBall(1));
    }

    @Test
    void test_magic_eight_ball3(){
        assertEquals("Maybe",test.magicEightBall(2));
    }

    @Test
    void test_magic_eight_ball4(){
        assertEquals("Ask again later.",test.magicEightBall(3));
    }
}