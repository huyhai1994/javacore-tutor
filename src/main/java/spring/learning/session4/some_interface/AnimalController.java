package spring.learning.session4.some_interface;

import java.util.List;

public class AnimalController {

    public static <T extends IAnimal> void fetchAnimal(List<T> animals) {
        animals.forEach(IAnimal::makenoise);
    }
}
