package spring.learning.session3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    @Test
    void testPlayerCountZero() {
        assertEquals(0, Player.playerCount);
    }

    @Test
    void testPlayerCount10() {
        for (int i = 0; i < 10; i++) {
            new Player();
        }
        List<Player> players  = new ArrayList<>();
        assertEquals(10, Player.playerCount);
    }
}