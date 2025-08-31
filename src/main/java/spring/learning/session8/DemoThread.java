package spring.learning.session8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numberOfThread = 2;
        ExecutorService threadPool = Executors.newFixedThreadPool(numberOfThread);
        for (int i = 0; i < numberOfThread; i++) {
            threadPool.submit(() -> increasingCounterTo100(counter));
        }
        threadPool.shutdown();
    }

    private static void increasingCounterTo100(Counter counter) {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + counter.incrementCounter());
        }
    }
}
