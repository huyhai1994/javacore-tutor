package spring.learning.session7.stream_api;

import java.util.List;

public class Color {
    public static void main(String[] args) {
        List<String> allColors = List.of("Red", "Blue", "Yellow"); // This is a "convenience factory method" for creating a new list from a known group of values.
        for (String color : allColors) {
            System.out.println(color);
        }

        allColors.forEach(System.out::println);
    }

}
