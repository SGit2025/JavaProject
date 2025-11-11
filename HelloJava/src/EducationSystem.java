//Multi-Level Inheritance Demo - Education system
//Created by Sanika - Inheritance (User Interactive version)


import java.util.Scanner;

class Person {
    String name;
    int age;

    void inputPersonalDetail(Scanner sc) {
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine();
    }

    void showPersonDetails() {
        System.out.println("\nPerson Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    String StudentId;
    String Course;

    void inputStudentDetails(Scanner sc) {
        inputPersonalDetail(sc);
        System.out.println("Enter Student ID: ");
        StudentId = sc.nextLine();
        System.out.println("Enter Course Enrolled: ");
        Course = sc.nextLine();
    }

    void showStudentDetails() {
        showPersonDetails();
        System.out.println("Student ID: " + StudentId);
        System.out.println("Course: " + Course);
    }

    void study() {
        System.out.println(name + " is studying " + Course + " 📚");
    }
}

class GraduateStudent extends Student {
    String thesisTopic;

    void inputGraduateDetails(Scanner sc) {
    inputStudentDetails(sc);
    System.out.println("Enter Thesis Topic: ");
    thesisTopic = sc.nextLine();
    }

    void showGraduateDetails() {
        showStudentDetails();
        System.out.println("Thesis Topic: " + thesisTopic);
    }

    void conductResearch() {
        System.out.println(name + " is conducting research on \"" + thesisTopic + "\"🧠");
    }
}

public class EducationSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("🎓 Welcome to Education System Demo");
        System.out.println("===================================");

        GraduateStudent GS = new GraduateStudent();
        GS.inputGraduateDetails(sc);

        System.out.println("\n======== Student Profile ========");
        GS.showGraduateDetails();

        System.out.println("\n======== Activities ========");
        GS.study();
        GS.conductResearch();

        System.out.println("\nData Captured Successfully! Keep learning, champ");
    }
}