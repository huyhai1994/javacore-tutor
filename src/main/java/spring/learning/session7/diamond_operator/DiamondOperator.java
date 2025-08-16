package spring.learning.session7.diamond_operator;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>(List.of("Ford", "Vinfast"));
        cars.forEach(System.out::println);
    }
}
