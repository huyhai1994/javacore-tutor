package spring.learning.session8.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {
    public static void main(String[] args) {
        Example ex = new Example();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(ex::method1);
        executorService.execute(ex::method2);
    }

}