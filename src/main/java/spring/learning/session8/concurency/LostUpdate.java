package spring.learning.session8.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
    int balance = 0;

    public synchronized void increment() {
        System.out.println("current Thread: " + Thread.currentThread().getName());
        balance++;
    }
}
