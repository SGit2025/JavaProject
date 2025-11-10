//Encapsulation Demo - Interactive Version
//Created by Sanika | Week 3 - Encapsulation (Interactive Console)

import java.util.Scanner;

class BankAccount1 {
    private String accountHolder;
    private double balance;

    BankAccount1(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    //Getters & Setters
    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Invalid name. Update failed.");
        }
    }

    public double getBalance() {
        return balance;
    }

    //Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful:  ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful:  ₹" + amount);
        }
    }
}

public class BankEncapsulationInteractive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Initial Balance:  ₹");
        double balance = sc.nextDouble();

        BankAccount1 account = new BankAccount1(name, balance);
        int choice;

        do {
            System.out.println("\n==== Bank Menu ====");
            System.out.println("1 Deposit Money");
            System.out.println("2 Withdraw Money");
            System.out.println("3 Check Balance");
            System.out.println("4 Update Account Holder Name");
            System.out.println("5 Exit");
            System.out.println("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    double wd = sc.nextDouble();
                    account.withdraw(wd);
                    break;
                case 3:
                    System.out.println("💵 Current Balance: ₹" + account.getBalance());
                    break;
                case 4:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter new account holder name: ");
                    String newName = sc.nextLine();
                    account.setAccountHolder(newName);
                    break;
                case 5:
                    System.out.println("👋 Exiting... Thank you for banking with us!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
