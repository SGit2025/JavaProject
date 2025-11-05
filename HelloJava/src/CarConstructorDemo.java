////Step 1 - Default Constructor Demo
//
//class Carr {
//    String brand;
//    String color;
//    int speed;
//
//    //Default Constructor
//    Carr(){
//        brand = "Unknown";
//        color = "Black";
//        speed = 0;
//        System.out.println("Default Constructor Called");
//    }
//
//    void showDetails() {
//        System.out.println("Brand: " + brand);
//        System.out.println("Color: " +color);
//        System.out.println("Speed: " + speed + " km/h\n");
//    }
//}
//public class CarConstructorDemo {
//    public static void main(String[] args) {
//        Carr carr1 = new Carr(); // Default constructor called automatically
//        carr1.showDetails();
//    }
//}


////Step 2 - Parameterized Constructor Demo
//
//// Demonstrating Classes & Object in Java
////Blueprint: Car with properties & behaviors
////Created by Sanika - Week 3 OOP Kickoff
//
//class Carss {
//    String brand;
//    String color;
//    int speed;
//
//    Carss(String brand, String color, int speed) {
//        this.brand = brand;
//        this.color = color;
//        this.speed = speed;
//        System.out.println("Parameterized Constructor Called");
//    }
//
//    void showDetails() {
//        System.out.println("Brand: " + brand);
//        System.out.println("Color: " + color);
//        System.out.println("Speed: " + speed + " km/h");
//    }
//}
//
//public class CarConstructorDemo {
//    public static void main(String[] args) {
//        Carss car1 = new Carss("BMW", "Black", 120);
//        Carss car2 = new Carss("Rolls Royals", "Pink",110);
//
//        car1.showDetails();
//        car2.showDetails();
//    }
//}


//Step 3 - Constructor Chaining using this()

class Caaar {
    String brand;
    String color;
    int speed;

    //Default Constructor
    Caaar() {
        this("Unknown", "White", 0); //Calls parameterized constructor
        System.out.println("Default Constructor (chained) Called");
    }

    //Parameterized Constructor
    Caaar(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        System.out.println("Parameterized Constructor Called");
    }
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed + " km/h");
    }
}

public class CarConstructorDemo {
    public static void main(String[] args) {
        Caaar car1 = new Caaar();
        Caaar car2 = new Caaar("Audi", "Blue",180);

        car1.showDetails();
        car2.showDetails();
    }
}