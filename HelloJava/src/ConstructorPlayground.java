// 💡 Phase 2: Constructors & Object Initialization

import java.util.Scanner;

class User1 {
    String name;
    int pin;
    double balance;

    // 🏗️ Default Constructor
    User1() {
        name = "Guest";
        pin = 3003;
        balance = 1000.0;
        System.out.println("🧾 Default User Created: " + name + " | Balance: ₹" + balance);
    }

    // ⚙️ Parameterized Constructor
    User1(String name, int pin, double balance) {
        this.name = name;
        this.pin = pin;
        this.balance = balance;
        System.out.println("🎉 New User Created: " + name + " | Balance: ₹" + balance);
    }


    // 🧬 Copy Constructor
    User1(User1 existingUser) {
        this.name = existingUser.name + "_Copy";
        this.pin = existingUser.pin;
        this.balance = existingUser.balance;
        System.out.println("📋 Copy Created from " + existingUser.name + " → " + this.name);
    }

    // 🔍 Display Method
    void displayInfo() {
        System.out.println("👤 Name: " + name + " | PIN: " + pin + " | Balance: ₹" + balance);
    }
}

public class ConstructorPlayground {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== 🎯 Constructor Playground (v1.0) =====");

        // 🧱 Using Default Constructor
        User1 u1 = new User1(); // default constructor
        u1.displayInfo();

        System.out.println("\n---------------------------------\n");

        // 💡 Using Parameterized Constructor
        User1 u2 = new User1("Sanika", 2856, 25000);
        u2.displayInfo();

        System.out.println("\n---------------------------------\n");

        // 🧬 Using Copy Constructor
        User1 u3 = new User1(u2);
        u3.displayInfo();

        sc.close();
        System.out.println("\n✅ All constructors tested successfully!");
    }
}
