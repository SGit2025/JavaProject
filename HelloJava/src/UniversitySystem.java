// 🎓 University Management System
// 🚀 Demonstrates Inheritance + Encapsulation + Menu Interaction
// 💻 Created by Sanika — Week 4 Mastery Project

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 🌱 Base Class
class Pperson {
    private String name;
    private int age;
    private String city;

    public Pperson(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getCity() { return city; }

    public void displayInfo() {
        System.out.println("👤 Name: " + name);
        System.out.println("🎂 Age: " + age);
        System.out.println("🏙️ City: " + city);
    }
}

// 🎓 Derived Class 1 — Student
class Studentt extends Pperson {
    private String rollNo;
    private String course;
    private int year;

    public Studentt(String name, int age, String city, String rollNo, String course, int year) {
        super(name, age, city);
        this.rollNo = rollNo;
        this.course = course;
        this.year = year;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("🎯 Roll No: " + rollNo);
        System.out.println("📘 Course: " + course);
        System.out.println("📅 Year: " + year);
        System.out.println("---------------------------------");
    }
}

// 👩‍🏫 Derived Class 2 — Teacher
class Teacher extends Pperson {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String city, String subject, double salary) {
        super(name, age, city);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("📖 Subject: " + subject);
        System.out.println("💰 Salary: ₹" + String.format("%,.2f", salary));
        System.out.println("---------------------------------");
    }
}

// 🏫 Management System
public class UniversitySystem {
    private static final Scanner sc = new Scanner(System.in);
    private static final List<Studentt> students = new ArrayList<>();
    private static final List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("🎓 Welcome to Smart University System 🏛️");
        System.out.println("========================================");

        int choice;
        do {
            System.out.println("\n===== Main Menu =====");
            System.out.println("1️⃣ Add Student");
            System.out.println("2️⃣ Add Teacher");
            System.out.println("3️⃣ View All Students");
            System.out.println("4️⃣ View All Teachers");
            System.out.println("5️⃣ Exit");
            System.out.print("👉 Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> addTeacher();
                case 3 -> viewStudents();
                case 4 -> viewTeachers();
                case 5 -> System.out.println("👋 Exiting System — Thank you!");
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter Roll No: ");
        String rollNo = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        students.add(new Studentt(name, age, city, rollNo, course, year));
        System.out.println("✅ Student Added Successfully!");
    }

    private static void addTeacher() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter City: ");
        String city = sc.nextLine();
        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();
        System.out.print("Enter Salary: ₹");
        double salary = sc.nextDouble();

        teachers.add(new Teacher(name, age, city, subject, salary));
        System.out.println("✅ Teacher Added Successfully!");
    }

    private static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No Students Found!");
        } else {
            System.out.println("\n===== Student Records =====");
            for (Studentt s : students) {
                s.displayInfo();
            }
        }
    }

    private static void viewTeachers() {
        if (teachers.isEmpty()) {
            System.out.println("⚠️ No Teachers Found!");
        } else {
            System.out.println("\n===== Teacher Records =====");
            for (Teacher t : teachers) {
                t.displayInfo();
            }
        }
    }
}