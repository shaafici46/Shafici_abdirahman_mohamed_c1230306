
import java.util.Scanner;

public class SimpleBankingSystem {

    static int balance = 0;
    static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pin;

        System.out.print("Samee 4-digit PIN: ");
        pin = scanner.nextLine();

        int attempts = 0;
        boolean authenticated = false;

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Geli PIN-ka: ");
            String enteredPin = scanner.nextLine();

            if (enteredPin.equals(pin)) {
                authenticated = true;
                break;
            } else {
                attempts++;
                System.out.println("PIN khalad ah. Isku day mar kale.");
            }
        }

        if (!authenticated) {
            System.out.println("3 jeer ayaa lagaa diiday. Nidaamka waa la xidhay.");
            return;
        }

        int choice;
        do {
            System.out.println("\n--- Banking Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Dooro: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> deposit(scanner);
                case 2 -> withdraw(scanner);
                case 3 -> checkBalance();
                case 4 -> System.out.println("Waad baxday. Mahadsanid.");
                default -> System.out.println("Fadlan dooro tiro sax ah.");
            }

        } while (choice != 4);
    }

    public static void deposit(Scanner scanner) {
        System.out.print("Geli lacagta aad dhigaysid: ");
        int amount = scanner.nextInt();
        balance += amount;
        System.out.println("Lacagta waa la dhigay.");
    }

    public static void withdraw(Scanner scanner) {
        System.out.print("Geli lacagta aad ka baxaysid: ");
        int amount = scanner.nextInt();
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Lacagta waa laga jaray.");
        } else {
            System.out.println("Lacagta kugu filan kuma jirto.");
        }
    }

    public static void checkBalance() {
        System.out.println("Hadhkaaga waa: $" + balance);
    }
}
