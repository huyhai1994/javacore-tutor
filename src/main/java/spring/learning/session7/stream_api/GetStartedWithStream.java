package spring.learning.session7.stream_api;

import java.util.List;
import java.util.stream.Stream;

public class GetStartedWithStream {
    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");
        Stream<String> stream = strings.stream()
                                .limit(4);

    }
}
