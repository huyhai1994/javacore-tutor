package spring.learning.session8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PredictableSleep {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(PredictableSleep::sleepThenPrint);
        System.out.println("back in main");
        executor.shutdown();
    }

    private static void sleepThenPrint() {
        try {
            TimeUnit.SECONDS.sleep(2); // Calling sleep here will force the new thread to leave the currently running state. The main thread will get a chance to pring out "back in main"
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("top o' the stack");
    }
}
