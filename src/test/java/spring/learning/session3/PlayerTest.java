package spring.learning.session3;

import org.junit.jupiter.api.Test;

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
        assertEquals(10, Player.playerCount);
    }
}