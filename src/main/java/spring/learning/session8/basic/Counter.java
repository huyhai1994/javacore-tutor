package spring.learning.session8.basic;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private static final AtomicInteger number = new AtomicInteger(0);

    public int incrementCounter() {
        return number.incrementAndGet();
    }
}
