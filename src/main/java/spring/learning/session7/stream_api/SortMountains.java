package spring.learning.session7.stream_api;

import java.util.ArrayList;
import java.util.List;

public class SortMountains {
    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        List<Mountain> mountains = new ArrayList<>();
        mountains.add(new Mountain("Longs", 14255));
        mountains.add(new Mountain("Elbert", 14433));
        mountains.add(new Mountain("Marron", 14156));
        mountains.add(new Mountain("Castle", 14265));
        System.out.println("as entered:\n " + mountains);
        mountains.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));
        System.out.println("by name:\n " + mountains);
        mountains.sort((m1, m2) -> Integer.compare(m2.getHeight(), m1.getHeight()));
        System.out.println("by height:\n " + mountains);
    }
}
