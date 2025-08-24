package spring.learning.session7.stream_api;

import java.util.Arrays;

public class VarargString {

    public static String inputString(String... input) {
        return Arrays
                .stream(input)
                .reduce("", (a, b) -> a + b);
    }
}
