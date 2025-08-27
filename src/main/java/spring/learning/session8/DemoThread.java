package spring.learning.session8;

public class DemoThread {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            increasingCounterTo100(counter);
        });
        Thread thread2 = new Thread(() -> {
            increasingCounterTo100(counter);
        });
        thread1.setName("Thead#1");
        thread1.start();
        thread2.setName("Thead#2");
        thread2.start();
    }

    private static void increasingCounterTo100(Counter counter) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + counter.incrementCounter());
        }
    }
}
