import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Employee Bonus Calculator ===");

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Experience (in years): ");
        int exp = sc.nextInt();

        double bonus;

        if (exp >= 3) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.03;
        }

        double totalPayout = salary + bonus;

        System.out.println("\n--- Salary Breakdown ---");
        System.out.println("Original Salary : " + salary);
        System.out.println("Bonus Amount    : " + bonus);
        System.out.println("Total Payout    : " + totalPayout);

        sc.close();
    }
}