import java.util.Scanner;

public class Account {
    private String correctPin;
    private double accountBalance;

    public Account(String correctPin, double initialBalance) {
        this.correctPin = correctPin;
        this.accountBalance = initialBalance;
    }

    public boolean enterPIN(Scanner scanner) {
        return PinManager.enterPIN(scanner, correctPin);
    }

    public boolean recheckPIN(Scanner scanner) {
        return PinManager.recheckPIN(scanner, correctPin);
    }

    public void changePIN(Scanner scanner) {
        PinManager.changePIN(scanner, correctPin);
    }

    public void withdraw(Scanner scanner) {
        TransactionManager.withdraw(scanner, accountBalance);
    }

    public void deposit(Scanner scanner) {
        TransactionManager.deposit(scanner, accountBalance);
    }

    public void displayBalance() {
        BalanceManager.displayBalance(accountBalance);
    }
}
