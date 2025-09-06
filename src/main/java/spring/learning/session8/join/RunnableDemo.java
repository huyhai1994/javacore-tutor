package spring.learning.session8.join;

public class RunnableDemo implements Runnable {
    RunnableDemo() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: New");
    }

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Running");
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
        }
        System.out.println("Thread: " + Thread.currentThread().getName() + ", " + "State: Dead");
    }
}
