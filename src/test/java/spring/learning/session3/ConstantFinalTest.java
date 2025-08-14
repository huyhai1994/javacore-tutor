package spring.learning.session3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstantFinalTest {

    @Test
    void testFinalInstanceVariable() {
        //assertThrows()
        assertEquals(3, ConstantFinal.SIZE);
    }

}