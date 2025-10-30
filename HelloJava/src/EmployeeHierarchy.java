class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    void showDetails() {
        System.out.println("Name:" +name);
        System.out.println("salary: ₹" +salary);
    }
}

class Manager extends Employee {
    double bonus;

    //using super() to call the parent constructor
    Manager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    //overriding method

    @Override
    void showDetails() {
        super.showDetails(); //calling parent method
        System.out.println("Bonus:  ₹" + bonus);
    }
}

class Developer extends Employee {
    String techStack;

    Developer(String name, double salary, String techStack) {
        super(name, salary);
        this.techStack = techStack;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Tech stack: " + techStack);
    }
}


class Intern extends Employee {
    double stipend;

    Intern(String name,double salary, double stipend) {
        super(name, salary);
        this.stipend = stipend;
    }

    @Override
    void showDetails() {
        super.showDetails();
        System.out.println("Intern Stipend is: " + stipend);
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args){
        Manager m1 = new Manager("Sanika", 60000, 10000);
        Developer d1 = new Developer("Mehek", 50000, "Java, Spring Boot");
        Intern i1 = new Intern("Neha",10000,1000);

        System.out.println("Manager Details: ");
        m1.showDetails();

        System.out.println("\n Developer Details: ");
        d1.showDetails();

        System.out.println("\n Intern Details: ");
        i1.showDetails();
    }
}
