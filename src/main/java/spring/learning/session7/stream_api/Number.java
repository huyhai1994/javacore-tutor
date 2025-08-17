package spring.learning.session7.stream_api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Number implements Comparable<Number> {
    private int v;

    public Number(int v) {
        this.v = v;
    }

    @Override
    public int compareTo(Number o) {
        return v - o.v;
    }

    @Override
    public String toString() {
        return "Number{" + "v=" + v + '}';
    }

    public static void main(String[] args) {
        List<Number> n = new ArrayList<>();
        n.add(new Number(4));
        n.add(new Number(7));
        n.add(new Number(199));
        n.add(new Number(10));
        Collections.sort(n);
        System.out.println(n);
    }
}
