import java.util.Scanner;
public class EmployeeProfile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Employee Profile: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        Integer age = sc.nextInt();

        System.out.print("Salary  : ");
        double salary = sc.nextDouble();

        System.out.println("\n------Saved Profile-------");
        System.out.println("Name:   "+name);
        System.out.println("Age:   "+age);
        System.out.println("Salary:   "+salary);
    }
}
