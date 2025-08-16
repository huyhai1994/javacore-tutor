package spring.learning.session7;

import spring.learning.session4.some_interface.IAnimal;

import java.util.List;

public class WildCards {


    public void takeAnimals(List<? extends IAnimal> animals) {
        for (IAnimal a : animals) {
            a.eat();
        }
    }
}
