package se.iths.philip.konto;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " kr insatt.");
        } else {
            System.out.println("Beloppet måste vara större än o.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " kr uttag.");
        } else {
            System.out.println("Uttaget misslyckades: kontrollera saldo eller belopp.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void printAccountInfo() {
        System.out.println(accountNumber);
        System.out.println(balance);
    }
}
