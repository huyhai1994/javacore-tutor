package spring.learning.session7.stream_api;

import org.junit.jupiter.api.Test;
import spring.learning.session7.lambda.Mountain;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveIfTest {
    @Test
    void testRemoveIf() {

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Long", 123));
        mountains.add(new Mountain("Abc", 1232));
        mountains.add(new Mountain("jjjj", 12333));
        mountains.add(new Mountain("kkkk", 123213));
        mountains.add(new Mountain("dawd", 12312));
        mountains.removeIf(m -> m.getName().contains("a") || m.getName().contains("A"));
        assertEquals(3, mountains.size());
    }
}
