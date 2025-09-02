package spring.learning.session8.concurency;

public class RyanAndMonicaJob implements Runnable {
    private final String name;
    private final BankAccount bankAccount;
    private final int amountToSpend;

    public RyanAndMonicaJob(String name, BankAccount bankAccount, int amountToSpend) {
        this.name = name;
        this.bankAccount = bankAccount;
        this.amountToSpend = amountToSpend;
    }

    @Override
    public void run() {
        goShopping(amountToSpend);
    }

    private void goShopping(int amountToSpend) {
        if (bankAccount.getBalance() >= amountToSpend) {
            System.out.println(name + " is about to spend " + Thread.currentThread().getName());
            bankAccount.spend(amountToSpend);
            System.out.println(name + " finishes spending" + " remaining account " + bankAccount.getBalance());
        } else {
            System.out.println("Sorry, not enough for " + name);
        }
    }

}
