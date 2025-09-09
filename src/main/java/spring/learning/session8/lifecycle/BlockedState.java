package spring.learning.session8.lifecycle;

import java.util.concurrent.TimeUnit;

public class BlockedState {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DemoBlockedRunnable());
        Thread t2 = new Thread(new DemoBlockedRunnable());

        t1.start();
        t2.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t2.getState());
        System.exit(0);
    }

}
