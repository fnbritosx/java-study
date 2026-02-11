package javamarathon.javacore.threads.domain;

public class Account {
    private int balance = 50;

    public int getBalance() {
        return balance;
    }

    public void withdrawal (int amount){
        if (getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " está indo sacar.");
            this.balance = this.balance - amount;
            System.out.println(Thread.currentThread().getName() + " sacou o dinheiro. O valor atual da conta é de: " +getBalance());
        }else {
            System.out.println(Thread.currentThread().getName() + " não conseguiu realizar o saque. SALDO INSUFICIENTE!");
        }
    }
}
