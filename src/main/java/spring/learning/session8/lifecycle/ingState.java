package spring.learning.session8.lifecycle;

import java.util.concurrent.TimeUnit;

public class ingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new ingState(), "Thead#1");
        t1.start();
        System.out.println("Current Thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        Thread t2 = new Thread(new DemoingStateRunnable(), "Thead#2");
        System.out.println("Thread t1 state " + ingState.t1.getState());
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Current Thread: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

        try {
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }

    }
}

class DemoingStateRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Current Thread: " + Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread t1 state " + ingState.t1.getState());
    }
}
