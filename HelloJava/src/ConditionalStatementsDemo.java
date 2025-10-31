// ⚙️ ConditionalStatementsDemo.java
// 💡 Demonstrates Nested if-else, Switch (int + String), Ternary operator, and Logical Operators
// 👩‍💻 Created by Sanika — Alltake ITES Trainee Dev 💪

import java.util.Scanner;

public class ConditionalStatementsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================================");
        System.out.println("🌟 WELCOME TO LOGIC LAB 2.0 — Powered by Java 🚀");
        System.out.println("====================================================\n");

        // 🔸 NESTED IF-ELSE — Smart Grading System
        System.out.print("📚 Enter your marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("🏆 Grade: A+ — Outstanding performance!");
        } else if (marks >= 75) {
            if (marks >= 85) {
                System.out.println("🔥 Grade: A — Excellent job!");
            } else {
                System.out.println("💪 Grade: B+ — Keep it up!");
            }
        } else if (marks >= 50) {
            System.out.println("🙂 Grade: C — You passed, but you can do better!");
        } else {
            System.out.println("❌ Grade: F — Don’t give up, keep grinding!");
        }

        // 🔸 SWITCH (int) — Day Identifier
        System.out.print("\n📅 Enter day number (1-3): ");
        int day = sc.nextInt();
        sc.nextLine(); // consume newline

        switch (day) {
            case 1 -> System.out.println("☀️ Monday — Fresh start, new hustle!");
            case 2 -> System.out.println("💻 Tuesday — Keep the momentum going!");
            case 3 -> System.out.println("📈 Wednesday — Midweek progress check!");
            default -> System.out.println("⚠️ Invalid day input!");
        }

        // 🔸 SWITCH (String) — Role-based Access
        System.out.print("\n🔐 Enter your role (Admin/User/Guest): ");
        String role = sc.nextLine();

        switch (role) {
            case "Admin" -> System.out.println("✅ Full access granted — You’re the boss!");
            case "User" -> System.out.println("🧑‍💼 Limited access — Welcome back!");
            case "Guest" -> System.out.println("👀 View-only mode — Explore safely!");
            default -> System.out.println("🚫 Unknown role — Please re-enter.");
        }

        // 🔸 TERNARY OPERATOR — Quick Decision Check
        System.out.print("\n🎂 Enter your age: ");
        int age = sc.nextInt();

        String status = (age >= 18) ? "🗳️ Eligible to vote!" : "🚫 Not eligible yet!";
        System.out.println(status);

        // 🔸 LOGICAL OPERATORS — Driving Eligibility Check
        boolean hasLicense = true;
        boolean hasCar = true;

        System.out.println("\n🚦 Driving Eligibility Check:");
        if (age >= 18 && hasLicense && hasCar) {
            System.out.println("✅ You can legally drive your car!");
        } else if (age >= 18 && (hasLicense || hasCar)) {
            System.out.println("⚠️ You need both a license and a car to drive!");
        } else if (age < 18 || !hasLicense) {
            System.out.println("❌ Sorry, you’re not allowed to drive yet!");
        } else {
            System.out.println("🧐 Something’s off — double-check your data!");
        }

        System.out.println("\n====================================================");
        System.out.println("✨ End of Demo — Keep coding, keep evolving 💻🌱");
        System.out.println("====================================================");

        sc.close();
    }
}