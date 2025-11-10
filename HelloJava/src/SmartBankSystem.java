// Encapsulation Demo — Real World Banking System
// Week 3 - Encapsulation (Final Polished Version)
// Created by Sanika 💼

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

class SmartBankAccount {
    private static int nextAccountNumber = 3003;
    private final int accountNumber;
    private String accountHolder;
    private double balance;
    private final List<String> miniStatement;

    SmartBankAccount(String accountHolder, double initialDeposit) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
        this.miniStatement = new ArrayList<>();
        miniStatement.add("Account Created | Initial Deposit: ₹" + String.format("%,.2f", initialDeposit));
    }

    public static int getNextAccountNumber() {
        return nextAccountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
            miniStatement.add("Name Changed to: " + accountHolder);
            System.out.println("✅ Account holder name updated successfully!");
        } else {
            System.out.println("⚠️ Invalid name. Update failed!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            miniStatement.add("Deposited: ₹" + String.format("%,.2f", amount));
            System.out.println("💰 Deposit Successful: ₹" + String.format("%,.2f", amount));
        } else {
            System.out.println("⚠️ Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            miniStatement.add("Withdrawn: ₹" + String.format("%,.2f", amount));
            System.out.println("💸 Withdrawal Successful: ₹" + String.format("%,.2f", amount));
        } else {
            System.out.println("⚠️ Insufficient balance or invalid amount!");
        }
    }

    public void printMiniStatement() {
        System.out.println("\n--- Mini Statement for Account #" + accountNumber + " ---");
        for (String entry : miniStatement) {
            System.out.println(entry);
        }
        System.out.println("Current Balance: ₹" + String.format("%,.2f", balance));
        System.out.println("-----------------------------------------------");
    }
}

public class SmartBankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🏦 Welcome to SmartBank System (Encapsulation Demo)");

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Deposit: ₹");
        double deposit = sc.nextDouble();

        SmartBankAccount account = new SmartBankAccount(name, deposit);
        int choice = -1;

        do {
            try {
                System.out.println("\n===== 🏦 SmartBank Menu =====");
                System.out.println("1️⃣ Deposit Money");
                System.out.println("2️⃣ Withdraw Money");
                System.out.println("3️⃣ Check Balance");
                System.out.println("4️⃣ View Mini Statement");
                System.out.println("5️⃣ Update Account Holder Name");
                System.out.println("6️⃣ Exit");
                System.out.print("👉 Enter your choice: ");

                if (!sc.hasNextInt()) {
                    System.out.println("⚠️ Please enter a valid numeric choice!");
                    sc.next(); // clear invalid input
                    continue;
                }

                choice = sc.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter amount to deposit: ₹");
                        double dep = sc.nextDouble();
                        if (dep > 10_00_000) {
                            System.out.println("⚠️ Max deposit limit is ₹10,00,000 only!");
                        } else {
                            account.deposit(dep);
                        }
                    }
                    case 2 -> {
                        System.out.print("Enter amount to withdraw: ₹");
                        double wd = sc.nextDouble();
                        if (wd > account.getBalance()) {
                            System.out.println("⚠️ Withdrawal amount exceeds your balance!");
                        } else {
                            account.withdraw(wd);
                        }
                    }
                    case 3 -> System.out.println("💵 Current Balance: ₹" + String.format("%,.2f", account.getBalance()));
                    case 4 -> account.printMiniStatement();
                    case 5 -> {
                        sc.nextLine(); // clear buffer
                        System.out.print("Enter new account holder name: ");
                        String newName = sc.nextLine();
                        account.setAccountHolder(newName);
                    }
                    case 6 -> System.out.println("👋 Thank you for banking with SmartBank!");
                    default -> System.out.println("⚠️ Invalid choice. Please try again.");
                }

            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input type. Please enter numeric values only.");
                sc.next(); // clear invalid token
            }

        } while (choice != 6);
    }
}
