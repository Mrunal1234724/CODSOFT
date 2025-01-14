import java.util.Scanner;

// Class to represent a user's bank account
class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }


    // Method to withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            //check if the withdrawal is successfull
            System.out.println("Withdrawal done successfully. New balance: $" + balance);
            return true;
        } else {
            System.out.println("Amount of withdrawal is invalid or insufficient balance.");
            return false;
        }
    }

     // Method to deposit money
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
         //check if the deposit is successfull
            System.out.println("Deposit done successfully. New balance: $" + balance);
        } else {
            System.out.println("Amount of deposit is invalid.");
        }
    }

    // Method to check balance
    public double getBalance() {
        return balance;
    }
}

// Class to represent the ATM machine
class ATM {
    private BankAccount account;

    // Constructor
    public ATM(BankAccount account) {
        this.account = account;
    }

    // Method for user interface
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose any option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM. Have a good day!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again...");
            }
        } while (choice != 4);

        scanner.close();
    }
}

// Main class
public class ATMSystem2 {
    public static void main(String[] args) {
        // Create a bank account with an initial balance
        BankAccount account = new BankAccount(1000.00);

        // Create an ATM instance and link it to the bank account
        ATM atm = new ATM(account);

        // Start the ATM
        atm.start();
    }
}
