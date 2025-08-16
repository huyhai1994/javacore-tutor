package spring.learning.session4.some_interface;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class AnimalControllerTest {
    @Test
    @DisplayName("Using generic")
    void testFetchAnimal() {

        List<Cat> cats = List.of(new Cat(), new Cat());
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<IAnimal> mixedAnimal = new ArrayList<>();
        mixedAnimal.addAll(cats);
        mixedAnimal.addAll(dogs);
        AnimalController.fetchAnimal(mixedAnimal);

    }

}