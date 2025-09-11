package spring.learning.session7.stream_api;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class DishTest {
    private final List<Dish> menu = List.of(
            new Dish("pork", false, 800, Type.MEAT),
            new Dish("beef", false, 700, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("french fries", true, 530, Type.OTHER),
            new Dish("rice", true, 350, Type.OTHER),
            new Dish("season fruit", true, 120, Type.OTHER),
            new Dish("pizza", true, 550, Type.OTHER),
            new Dish("chicken", false, 400, Type.MEAT),
            new Dish("prawns", false, 300, Type.FISH),
            new Dish("salmon", false, 450, Type.FISH)
    );

    @Test
    public void threeHighCaloriesFood() {
        List<String> threeHighCaloricDishNames = menu
                .stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .toList();
        assertEquals(threeHighCaloricDishNames, List.of("pork", "beef", "chicken"));
    }

    @Test
    public void externalIterationUsingIterator() {
        List<String> names = new ArrayList<>();
        Iterator<Dish> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Dish d = iterator.next();
            names.add(d.getName());
        }
        names.forEach(System.out::println);
    }

    @Test
    public void iternalIterationUsingStream() {
        List<String> names = menu.stream().map(Dish::getName).toList();
        names.forEach(System.out::println);
    }

    @Test
    public void getVegetarianDishes() {
        List<String> vegetarianDishes =
                menu.stream()
                        .filter(Dish::isVegetarian)
                        .map(Dish::getName)
                        .toList();
        vegetarianDishes.forEach(System.out::println);
    }
}