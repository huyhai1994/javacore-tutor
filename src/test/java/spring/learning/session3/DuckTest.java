package spring.learning.session3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
    private Duck duck;

    @BeforeEach
    void setUp(){
        duck = new Duck(0);
    }


    @Test
    void testDuckSize(){
        assertEquals(27,duck.size);
    }


}