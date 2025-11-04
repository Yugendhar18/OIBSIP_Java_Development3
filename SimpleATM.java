import java.util.ArrayList;
import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 5000, withdraw, deposit;
        int pin = 1805;
        int accountNumber = 785855008;
        String accountHolder = "V Yugendhar";

        // Transaction history list
        ArrayList<String> transactions = new ArrayList<>();

        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != pin) {
            System.out.println("Invalid PIN! Access Denied.");
            return;
        }

        while (true) {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Mini Statement");
            System.out.println("5. Transfer Money");
            System.out.println("6. Account Information");
            System.out.println("7. Exit");
            System.out.print("\n\n Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    withdraw = sc.nextInt();
                    if (withdraw > balance) {
                        System.out.println("Insufficient balance!");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawn ₹" + withdraw);
                        transactions.add("Withdrawn: ₹" + withdraw);
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to deposit: ");
                    deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println("Deposited ₹" + deposit);
                    transactions.add("Deposited: ₹" + deposit);
                    break;

                case 4:
                    System.out.println("\n MINI STATEMENT:");
                    if (transactions.isEmpty()) {
                        System.out.println("No transactions yet.");
                    } else {
                        for (String t : transactions) {
                            System.out.println(t);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Enter Receiver Account Number: ");
                    int receiver = sc.nextInt();
                    System.out.print("Enter Amount to Transfer: ");
                    int amount = sc.nextInt();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println(" ₹" + amount + " transferred successfully to account " + receiver);
                        transactions.add("Transferred ₹" + amount + " to Account " + receiver);
                    } else {
                        System.out.println(" Insufficient balance!");
                    }
                    break;

                case 6:
                    System.out.println("\n ACCOUNT INFORMATION:");
                    System.out.println("Account Holder: " + accountHolder);
                    System.out.println("Account Number: " + accountNumber);
                    System.out.println("Current Balance: ₹" + balance);
                    System.out.println("Total Transactions: " + transactions.size());
                    break;

                case 7:
                    System.out.println("Thank you, " + accountHolder + "! Visit again.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }
}
