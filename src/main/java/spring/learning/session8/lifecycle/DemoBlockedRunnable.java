package spring.learning.session8.lifecycle;

public class DemoBlockedRunnable implements Runnable {
    @Override
    public void run() {
        commonResource();
    }

    private static synchronized void commonResource() {
        while (true) {

        }
    }
}
