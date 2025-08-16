package spring.learning.session7.lambda;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MountainTest {
    @Test
    void sortingMountainByName() {

        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Long", 123));
        mountains.add(new Mountain("Abc", 1232));
        mountains.add(new Mountain("jjjj", 12333));
        mountains.add(new Mountain("kkkk", 123213));
        mountains.add(new Mountain("dawd", 12312));
        mountains.sort(Comparator.comparing(m -> m.name));
        System.out.println(mountains);
        mountains.sort(Comparator.comparingInt(Mountain::getHeight));
        System.out.println(mountains);

    }

}