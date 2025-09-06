package spring.learning.session8.concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.jupiter.api.Assertions.*;

class RyanAndMonicaJobTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        RyanAndMonicaJob ryan = new RyanAndMonicaJob("Ryan", account, 50);
        RyanAndMonicaJob monica = new RyanAndMonicaJob("Monica", account, 100);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(ryan);
        executorService.execute(monica);
        executorService.shutdown();
    }

}