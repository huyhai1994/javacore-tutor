package spring.learning.session4;

import org.junit.jupiter.api.Test;
import spring.learning.session4.some_interface.Dog;
import spring.learning.session4.some_interface.IAnimal;

class IAnimalTest {
    @Test
    void testMakenoise() {
        IAnimal animal = new Dog();
        animal.makenoise();
    }
}