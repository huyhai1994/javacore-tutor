package spring.learning.design_parttern;

import java.util.List;

// Test
public class DuckTest {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();

        List<Duck> ducks = List.of(mallard, redhead, rubberDuck);
        for (Duck duck : ducks) {
            duck.quack();
            duck.swim();
            duck.display();
            System.out.println();
        }
    }
}
