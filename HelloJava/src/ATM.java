import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// CLASS → defines a blueprint for objects (OOP foundation)
class User {
    String name;             // Instance variable (Object's property)
    int pin;
    double balance;
    ArrayList<String> transactionHistory = new ArrayList<>();  // Used to store transactions dynamically

    // CONSTRUCTOR → special method that initializes an object
    User(String name, int pin, double balance) {
        this.name = name;       // 'this' → refers to the current object
        this.pin = pin;
        this.balance = balance;
    }
}

// 💻 MAIN CLASS → contains our ATM system logic
public class ATM {
    public static void main(String[] args) {

        // INPUT → using Scanner to take user input
        Scanner sc = new Scanner(System.in);

        // MULTIPLE OBJECTS → each represents a different user
        User[] users = {
                new User("Sanika", 2856, 25000.0),
                new User("Mehek", 3003, 10000.0),
                new User("Neha", 1001, 15000.0)
        };

        User currentUser = null; // Reference to currently logged-in user

        System.out.println("===== Welcome to Sanika Bank ATM =====");

        // LOOP → keeps asking for PIN until correct or attempts run out
        int attempts = 3;
        while (attempts > 0 && currentUser == null) {
            System.out.print("Enter your PIN: ");
            try {
                int enteredPin = sc.nextInt();

                // LOOP + CONDITIONAL → check each user for matching PIN
                for (User user : users) {
                    if (user.pin == enteredPin) {   // CONDITIONAL (if)
                        currentUser = user;         // assign matched user
                        break;
                    }
                }

                // CONDITIONALS → logic for wrong PIN attempts
                if (currentUser == null) {
                    attempts--;
                    if (attempts > 0) {
                        System.out.println("Incorrect PIN. Attempts left: " + attempts);
                    } else {
                        System.out.println("Too many failed attempts. Account locked!");
                        System.exit(0); // exit program
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! PIN should be numbers only.");
                sc.nextLine(); // clear invalid input
            }
        }

        System.out.println("Welcome " + currentUser.name + "! Login successful.\n");

        // INFINITE LOOP → keeps showing menu until user chooses exit
        while (true) {
            System.out.println("------ ATM Menu ------");
            System.out.println("1️⃣ Check Balance");
            System.out.println("2️⃣ Deposit");
            System.out.println("3️⃣ Withdraw");
            System.out.println("4️⃣ View Transaction History");
            System.out.println("5️⃣ Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();   // INPUT → menu option from user
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number between 1 and 5.\n");
                sc.nextLine();
                continue;   // loop continues
            }

            System.out.println();

            // SWITCH CASE → multiple condition handling
            switch (choice) {
                case 1:
                    // CONDITIONAL LOGIC (display balance)
                    System.out.println("Current Balance: ₹" + currentUser.balance);
                    currentUser.transactionHistory.add("Checked Balance: ₹" + currentUser.balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    try {
                        double deposit = sc.nextDouble();
                        if (deposit > 0) {  // CONDITIONAL (valid amount)
                            currentUser.balance += deposit;
                            currentUser.transactionHistory.add("Deposited ₹" + deposit);
                            System.out.println("Deposited ₹" + deposit + " successfully!");
                        } else {
                            System.out.println("Invalid deposit amount!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number!");
                        sc.nextLine();
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    try {
                        double withdraw = sc.nextDouble();
                        // CONDITIONAL CHAIN → multiple conditions together
                        if (withdraw <= 0) {
                            System.out.println("Invalid withdrawal amount!");
                        } else if (withdraw > currentUser.balance) {
                            System.out.println("Insufficient balance!");
                            currentUser.transactionHistory.add("Failed Withdrawal Attempt of ₹" + withdraw);
                        } else {
                            currentUser.balance -= withdraw;
                            currentUser.transactionHistory.add("Withdrew ₹" + withdraw);
                            System.out.println("Withdrawn ₹" + withdraw + " successfully!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Please enter a valid number!");
                        sc.nextLine();
                    }
                    break;

                case 4:
                    System.out.println("Transaction History for " + currentUser.name + ":");
                    if (currentUser.transactionHistory.isEmpty()) {
                        System.out.println("No transactions yet."); //CONDITIONAL
                    } else {
                        // LOOP → iterate and print all history records
                        for (String record : currentUser.transactionHistory) {
                            System.out.println("- " + record);
                        }
                    }
                    break;

                case 5:
                    // EXIT → break out cleanly
                    System.out.println("Thank you, " + currentUser.name + ". Logging out securely...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("------------------------------\n");
        }
    }
}