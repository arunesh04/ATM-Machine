import java.util.Scanner;

public class TransactionManager {
    public static void withdraw(Scanner scanner, double accountBalance) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= accountBalance) {
            accountBalance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
        } else {
            System.out.println("Invalid amount or insufficient balance. Please try again.");
        }
    }

    public static void deposit(Scanner scanner, double accountBalance) {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
        accountBalance += amount;
        System.out.println("Deposit successful");
    }
}
