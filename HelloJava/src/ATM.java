import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int pin = 1234;

        System.out.println("===== Welcome to Sanika Bank ATM =====");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        // ✅ PIN Verification
        if (enteredPin == pin) {
            System.out.println("✅ Login Successful! Access Granted.\n");

            while (true) {
                System.out.println("------ Main Menu ------");
                System.out.println("1️⃣ Check Balance");
                System.out.println("2️⃣ Deposit Money");
                System.out.println("3️⃣ Withdraw Money");
                System.out.println("4️⃣ Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.println("💰 Current Balance: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ₹");
                        int deposit = sc.nextInt();
                        balance += deposit;
                        System.out.println("✅ ₹" + deposit + " deposited successfully!");
                        System.out.println("💰 Updated Balance: ₹" + balance);
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ₹");
                        int withdraw = sc.nextInt();
                        if (withdraw > balance) {
                            System.out.println("❌ Insufficient balance, bro. Chill on the spending 😭");
                        } else {
                            balance -= withdraw;
                            System.out.println("✅ ₹" + withdraw + " withdrawn successfully!");
                            System.out.println("💰 Remaining Balance: ₹" + balance);
                        }
                        break;

                    case 4:
                        System.out.println("🙏 Thank you for using Sanika Bank. Logging out...");
                        System.exit(0); // gracefully ends program
                        break;

                    default:
                        System.out.println("⚠️ Invalid choice. Try again.");
                }
                System.out.println("------------------------------\n");
            }
        } else {
            System.out.println("❌ Incorrect PIN. Access denied.");
        }

        sc.close(); // clean resource shutdown
    }
}
