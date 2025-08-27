package spring.learning.session8;

public class Counter {
    private static int number;

    public synchronized int incrementCounter() {
        number++;
        return number;
    }
}
