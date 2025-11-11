//Inheritance Demo - vehicle Management System
//Week 4 -  Inheritance Basics by Sanika

class Vehiclee {
    String brand;
    int wheels;
    double mileage;

    Vehiclee(String brand, int wheels, double mileage) {
        this.brand = brand;
        this.wheels = wheels;
        this.mileage = mileage;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Wheels: " + wheels);
        System.out.println("Mileage: " + mileage + "km/l");
    }

    void start() {
        System.out.println("Vehicle is Starting...");
    }

}

class Caarr extends Vehiclee {
    int airbags;

    //Car constructor uses super() to call Vehicle's constructor
    Caarr(String brand, double mileage, int airbags) {
        super(brand, 4, mileage);
        this.airbags = airbags;
    }

    void carFeature() {
        System.out.println("This car has" + airbags +  "airbags");
    }
}

class Bike extends Vehiclee {
    boolean hasABS;

    Bike(String brand , double mileage , boolean hasABS) {
        super(brand, 2 , mileage);
        this.hasABS = hasABS;
    }

    void bikeFeature() {
        System.out.println("ABS Equipped: " + hasABS);
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        System.out.println("Vehicle Management System Initialized!\n");

        Caarr c1 = new Caarr("Porsche",25,2);
        Bike b1 = new Bike("BMW",30,true);

        c1.displayDetails();
        c1.carFeature();
        c1.start();

        System.out.println("--------------------------------------");
        b1.displayDetails();
        b1.bikeFeature();
        b1.start();
    }
}