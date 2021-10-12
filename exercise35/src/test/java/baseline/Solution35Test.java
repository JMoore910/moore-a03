package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {
    PrizeGame testGame = new PrizeGame();

    @Test
    void test_get_winner(){
        ArrayList<String> list = new ArrayList<>();
        list.add("James");
        list.add("Nate");
        list.add("Billy");
        assertEquals("The winner is... Billy!!!",testGame.pickWinner(list,2));
    }
}