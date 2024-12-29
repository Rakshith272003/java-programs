package Encapsulation;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an initial balance
        System.out.print("Enter initial balance for the account: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(initialBalance);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Set Balance");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: " + account.getBalance());
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Transaction complete. New balance: " + account.getBalance());
                    break;

                case 4:
                    // Set balance
                    System.out.print("Enter new balance: ");
                    double newBalance = scanner.nextDouble();
                    account.setBalance(newBalance);
                    System.out.println("Updated balance: " + account.getBalance());
                    break;

                case 5:
                    // Exit the program
                    running = false;
                    System.out.println("Thank you for using the banking system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

