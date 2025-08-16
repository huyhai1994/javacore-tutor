package spring.learning.session7.diamond_operator;

import java.util.ArrayList;
import java.util.List;

public class DiamondOperator {
    public static void main(String[] args) {
        List cars = new ArrayList();
        cars.add(new Object());
        cars.add("car");
        String carName = (String) cars.get(0);
    }
}
