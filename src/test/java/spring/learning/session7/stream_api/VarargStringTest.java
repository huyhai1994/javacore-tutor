package spring.learning.session7.stream_api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VarargStringTest {
    @Test
    void testVaragrs(){
       String result = "hello World";
       assertEquals(result, VarargString.inputString("hello"," ","World"));
    }

}