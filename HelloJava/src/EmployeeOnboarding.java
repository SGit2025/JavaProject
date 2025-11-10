//Demonstrate constructor overloading & chaining
//Created by Sanika | Week 3 - Constructor Mastery (Enhanced Version)

class Employeee {
    static int nextId = 101;  // auto employee ID generator
    int empId;
    String name;
    String department;
    double salary;

    Employeee() {
        this("Unknown", "Not Assigned", 0.0);
        System.out.println("Default Constructor Called");
    }

    Employeee(String name, String department) {
        this(name, department, 300000.0);
        System.out.println("Constructor with 2 Params Called");
    }

    Employeee(String name, String department, double salary) {
        this.empId = nextId++;
        this.name = name;
        this.department = department;
        this.salary = salary;
        System.out.println("Constructor with 3 Params Called");
    }

    void displayInfo() {
        System.out.println("----------------------------------");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + String.format("%,.2f", salary));
        System.out.println("----------------------------------");
    }
}

public class EmployeeOnboarding {
    public static void main(String[] args) {
        System.out.println("🚀 Employee Onboarding System Initialized!\n");

        Employeee e1 = new Employeee();
        Employeee e2 = new Employeee("Sanika", "Development");
        Employeee e3 = new Employeee("Mehek", "HR", 500000.0);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}