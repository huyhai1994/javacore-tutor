package spring.learning.session8.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LostUpdate {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(6);
        Balance balance = new Balance();
        for (int i = 0; i < 1000; i++) {
            pool.execute(balance::increment);
        }
        pool.shutdown();
        try {
            if (pool.awaitTermination(1, TimeUnit.MINUTES)) {
                System.out.println("balance = " + balance.balance);
            } else {
                System.out.println("Timeout: Some tasks are still running.");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class Balance {
    AtomicInteger balance = new AtomicInteger(0);

    public void increment() {
        System.out.println("current Thread: " + Thread.currentThread().getName());
        balance.incrementAndGet();
    }
}
