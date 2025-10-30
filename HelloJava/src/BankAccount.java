public class BankAccount {
    String name;
    double balance;

    // Default constructor
    BankAccount() {
        System.out.println("Account created successfully!");
        balance = 1000; // default balance
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        BankAccount account1 = new BankAccount();

        // Optional: print the default balance
        System.out.println("Default Balance: ₹" + account1.balance);
    }
}
