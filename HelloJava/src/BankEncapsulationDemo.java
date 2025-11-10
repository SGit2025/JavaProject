// Demonstrate Encapsulation with Getters & Setters
// Created by Sanika | Week 3 - Encapsulation Mastery

class BankAccount {
    // ✅ Private data members (cannot be accessed directly)
    private String accountHolder;
    private double balance;

    // ✅ Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // ✅ Public getter for account holder
    public String getAccountHolder() {
        return accountHolder;
    }

    // ✅ Public setter (we can control what values are allowed)
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("⚠️ Invalid name. Update failed.");
        }
    }

    // ✅ Public getter for balance
    public double getBalance() {
        return balance;
    }

    // ✅ Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("💰 Deposit Successful: ₹" + amount);
        } else {
            System.out.println("⚠️ Deposit amount must be positive!");
        }
    }

    // ✅ Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("💸 Withdrawal Successful: ₹" + amount);
        } else {
            System.out.println("⚠️ Insufficient balance or invalid amount!");
        }
    }
}

public class BankEncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Sanika", 5000);

        System.out.println("👤 Account Holder: " + acc1.getAccountHolder());
        System.out.println("💵 Initial Balance: ₹" + acc1.getBalance());

        acc1.deposit(2000);
        acc1.withdraw(1000);

        acc1.setAccountHolder("Sanika G.");
        System.out.println("✅ Updated Account Holder: " + acc1.getAccountHolder());

        System.out.println("💰 Final Balance: ₹" + acc1.getBalance());
    }
}
