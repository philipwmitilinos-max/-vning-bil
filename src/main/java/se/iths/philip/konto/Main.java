package se.iths.philip.konto;

public class Main {
    public static void main(String[] args) {
        BankAccount mittKonto = new BankAccount("1234-5678");

        mittKonto.printAccountInfo();

        mittKonto.deposit(1000);
        mittKonto.withdraw(200);
        System.out.println("Nuvarande saldo: " + mittKonto.getBalance() + " kr");
    }
}
