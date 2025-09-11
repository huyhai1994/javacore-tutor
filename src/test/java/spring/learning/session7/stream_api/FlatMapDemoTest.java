package spring.learning.session7.stream_api;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class FlatMapDemoTest {
    private List<String> words = List.of("Hello", "World");

    @Test
    public void splitUniqueWord() {
        List<String[]> uniqueWords = words.stream()
                .map(word -> word.split(""))
                .distinct()
                .toList();
        uniqueWords.forEach(System.out::println);
    }

    @Test
    public void splitUsingMapAndArrayStream() {
        List<Stream<String>> uniqueWords = words.stream()
                .map(w -> w.split(""))
                .map(Arrays::stream)
                .distinct()
                .toList();
        uniqueWords.forEach(System.out::println);
    }

    @Test
    @DisplayName("Flattens each generated stream into a single stream")
    public void splitUsingFlatMap() {
        List<String> uniqueWords = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        uniqueWords.forEach(System.out::println);
    }
}