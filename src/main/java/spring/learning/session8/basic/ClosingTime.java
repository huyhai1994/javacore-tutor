package spring.learning.session8.basic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ClosingTime {
    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(2);
        long startTime = System.currentTimeMillis();
        threadPool.execute(new LongJob("Long Job"));
        threadPool.execute(new ShortJob("Short Job"));
        threadPool.shutdown();

        try {
            boolean finished = threadPool.awaitTermination(5, TimeUnit.SECONDS);
            long endTime = System.currentTimeMillis();
            System.out.println("Finished? " + finished + " at " + (endTime - startTime));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private record LongJob(String name) implements Runnable {

        @Override
        public void run() {
            System.out.println(name + " Start at " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(10);
                System.out.println(name + " Stop at " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private record ShortJob(String name) implements Runnable {

        @Override
        public void run() {
            System.out.println(name + " Start at " + Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
                System.out.println(name + " Stop at " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
