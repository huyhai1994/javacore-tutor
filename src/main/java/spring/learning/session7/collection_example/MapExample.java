package spring.learning.session7.collection_example;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        Map<String, Integer> scores2 = new TreeMap<>();
        scores.put("Kathy", 42);
        scores.put("John", 35);
        scores.put("Alice", 28);
        scores.put("Bob", 50);
        scores.put("Emma", 47);
        scores.put("David", 39);
        System.out.println(scores);
        System.out.println(
                scores.get("Alice" )
        );
        System.out.println(scores.containsKey("alice".toLowerCase()));
    }
}
