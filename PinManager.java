import java.util.Scanner;

public class PinManager {
    public static boolean enterPIN(Scanner scanner, String correctPin) {
        System.out.print("Enter your PIN: ");
        String enteredPIN = scanner.next();
        return enteredPIN.equals(correctPin);
    }

    public static boolean recheckPIN(Scanner scanner, String correctPin) {
        System.out.print("Re-enter your PIN: ");
        String enteredPIN = scanner.next();
        return enteredPIN.equals(correctPin);
    }

    public static void changePIN(Scanner scanner, String correctPin) {
        System.out.print("Enter new PIN: ");
        String newPIN = scanner.next();
        correctPin = newPIN;
        System.out.println("PIN changed successfully.");
    }
}
