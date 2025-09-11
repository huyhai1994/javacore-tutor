package spring.learning.session7.stream_api;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOfSquareTest {
    @Test
    public void returnListOfSquareNumber() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        List<Integer> result = List.of(1, 4, 9, 16, 25);
        assertEquals(numbers.stream().map(
                n -> n * n
        ).toList(), result);

    }
}
