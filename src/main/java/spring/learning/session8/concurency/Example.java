package spring.learning.session8.concurency;

import java.util.concurrent.TimeUnit;

public class Example {
    void method1() {
        System.out.println("method1 start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("method1 end");
    }

    void method2() {
        System.out.println("method2 start");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("method2 end");
    }
}
