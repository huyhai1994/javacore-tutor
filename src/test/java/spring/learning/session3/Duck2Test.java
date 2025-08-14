package spring.learning.session3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Duck2Test {

    @Test
    void testNoArgsConstructor() {
        Duck2 duck = new Duck2();
        assertEquals(27, duck.size);
    }

}