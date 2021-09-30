package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    Solution35 sol35 = new Solution35();

    @Test
    public void test_get_winner(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("James");
        list.add("Nate");
        list.add("Billy");
        assertEquals("Billy",sol35.pickWinner(list,2));
    }
}