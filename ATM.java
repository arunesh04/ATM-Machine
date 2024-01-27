import java.util.Scanner;

public class ATM {
    public static final int MAX_PIN_TRIES = 3;
    public static int pinTries = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account("1111", 10000.0); // Change PIN and initial balance as needed

        System.out.println("Welcome to the ATM Machine!");

        while (!account.enterPIN(scanner)) {
            if (pinTries >= MAX_PIN_TRIES) {
                System.out.println("Too many incorrect attempts. Exiting...");
                System.exit(0);
            }
        }

        while (true) {
            Menu.displayMenu();

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (!account.recheckPIN(scanner)) {
                System.out.println("Incorrect PIN. Exiting...");
                System.exit(0);
            }

            switch (choice) {
                case 1:
                    account.changePIN(scanner);
                    break;
                case 2:
                    account.deposit(scanner);
                    break;
                case 3:
                    account.withdraw(scanner);
                    break;
                case 4:
                    account.displayBalance();
                    break;
                case 5:
                    System.out.println("Exiting ATM. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
