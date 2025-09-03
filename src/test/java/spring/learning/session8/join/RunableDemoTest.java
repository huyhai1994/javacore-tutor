package spring.learning.session8.join;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class RunnableDemoTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread( new RunnableDemo(), "Thread-1");
        Thread t2 = new Thread( new RunnableDemo(), "Thread-2");
        Thread t3 = new Thread( new RunnableDemo(), "Thread-3");
        // start t1 thread and join main thread
        t1.start();
        t1.join();
        // t2 will start when t1 is dead
        t2.start();
        t2.join();
        // t3 will start when t2 is dead
        t3.start();    }
}